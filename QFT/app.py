import pandas as pd
import numpy as np
from flask import Flask, render_template


app = Flask(__name__)

df = pd.read_csv('./static/data/Clean_Data_2023-01-13.csv')
df.fillna('', inplace=True)
df['Study ID'] = df['Study ID'].str.upper()

df['Nil'] = df['Nil'].replace('> 10', np.nan).astype(float)
df['Nil'] = df['Nil'].replace(np.nan, '> 10')

df['TB1'] = df['TB1'].replace('> 10', np.nan).astype(float)
df['TB1'] = df['TB1'].replace(np.nan, '> 10')

df['TB2'] = df['TB2'].replace('> 10', np.nan).astype(float)
df['TB2'] = df['TB2'].replace(np.nan, '> 10')

df['Mito'] = df['Mito'].replace('> 10', np.nan).astype(float)
df['Mito'] = df['Mito'].replace(np.nan, '> 10')


# -- function : get the data from row index 'n' into dict --#


def getData(n):

    # Variables
    patient = dict(

        # Patient Detials
        name=df.iloc[n]['Name']+' '+df.iloc[n]['Surname'],
        dob=df.iloc[n]['DOB'],
        age=int(df.iloc[n]['Age']),
        gender=df.iloc[n]['Gender'],
        hn=df.iloc[n]['HN'],

        # Sample Detials
        collect=df.iloc[n]['Date Collected'],
        receive=df.iloc[n]['Date Received'],
        process=df.iloc[n]['Date Processed'],
        report=df.iloc[n]['Date Reported'],
        id=df.iloc[n]['Study ID'],

        # Results
        nil=df.iloc[n]['Nil'],
        tb1=df.iloc[n]['TB1'],
        tb2=df.iloc[n]['TB2'],
        mit=df.iloc[n]['Mito'],
        result=df.iloc[n]['Result'],
        remark=df.iloc[n]['Remark01'],

        # Print
        toPrint=df.iloc[n]['to_Print']
    )

    if isinstance(df.iloc[n]['Nil'], float):
        patient['nil'] = "{:.2f}".format(df.iloc[n]['Nil'])

    if isinstance(df.iloc[n]['TB1'], float):
        patient['tb1'] = "{:.2f}".format(df.iloc[n]['TB1'])

    if isinstance(df.iloc[n]['TB2'], float):
        patient['tb2'] = "{:.2f}".format(df.iloc[n]['TB2'])

    if isinstance(df.iloc[n]['Mito'], float):
        patient['mit'] = "{:.2f}".format(df.iloc[n]['Mito'])

    return patient


# -- input row index here!! --#
patient = getData(0)

if patient['toPrint'] == True:
    @app.route('/')
    def home():
        return render_template('home.html', patient=patient)
else:
    @app.route('/')
    def home():
        return render_template('error.html', patient=patient)


if __name__ == '__main__':
    app.run(debug=True)

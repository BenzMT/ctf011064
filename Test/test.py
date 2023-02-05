# from selenium import webdriver

# options = webdriver.ChromeOptions()
# options.add_argument('--headless')
# options.add_argument('--disable-gpu')

# driver = webdriver.Chrome(options=options)
# file_path = 'C:/Users/Phitsinee/ctf011064/Test/template.html'
# driver.get(file_path)

# # Wait for the page to load
# driver.implicitly_wait(10)

# # Select the "Save as PDF" option in the print dialog and include background graphics
# driver.execute_script(
#     'var media = matchMedia("print"); media.addListener(function(mql) { if (mql.matches) { document.body.innerHTML = "PDF generated with background graphics"; } });')

# pdf_file_path = 'C:/Users/Phitsinee/ctf011064/Test/example.pdf'
# driver.save_screenshot(pdf_file_path)
# driver.quit()

from selenium import webdriver

chrome_options = webdriver.ChromeOptions()
chrome_options.add_argument('--headless')
chrome_options.add_argument('--disable-gpu')
chrome_options.add_argument('--print-to-pdf')

driver = webdriver.Chrome(chrome_options=chrome_options)

driver.get("https://google.com")
# driver.quit()

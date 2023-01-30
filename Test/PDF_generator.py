from selenium import webdriver

# set a headless browser
options = webdriver.ChromeOptions()
options.add_argument('--headless')
options.add_argument('--disable-gpu')

pdf = webdriver.common.print_page_options.PrintOptions()


browser = webdriver.Chrome(chrome_options=options)

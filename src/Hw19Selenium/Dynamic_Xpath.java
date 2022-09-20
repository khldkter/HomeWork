package Hw19Selenium;

public class Dynamic_Xpath {
	
//tag with a single  attribute:1
//WWW.CVS	
	
//	search field-->//  // span[@id='kampyleButtonContainer']	
//search field-->////a[@class='skip-nav']	
//cart-->//span[@id='kampyleButtonContainer']
//Get started online-->////a[@class='skip-nav']
//www.amazon
//logo-->//span[@class='nav-logo-locale']	

	
//tag with multiple attribute with or logic	:2
//www.walgreen	

// schedule vaccine-->  //div[@id='Homepage_BrandStory_CT_CEP'or@class='Homepage_BrandStory_CT_CE']
	
//schedule vaccine--> //iframe[@id='destination_publishing_iframe_walgreens_0 'or@name='destination_publishing_iframe_walgreens_0_name']  
//WWW.amazon
	
//logo-->	//div[@id='nav-main'or@class='nav-progressive-contentl']
//logo-->	//div[@id='nav-global-location-slot'or@class='lnav-progressive-content']
//search field---> //div[@id=' nav-iss-attach' or@class='layoutToolbarPadding']	
	
//tag with multiple attribute with 'and' logic:3
//WWW.Bestbuy	
	
//logo----->//div[@class='top-fluid-container' and @id='shop-header-78356429']	
//logo----->//iframe[@name='google_ads_top_frame' and @id='google_ads_top_frame']	
//Cart---->//div[@id='shop-header-89323249' and @class='_none']	
//search field--->//input[@id='gh-search-input' and @class='search-input']
//search field--->//input[@id='keys' and @name='keys']
	
//Tag with inner text:4	
//WWW.amazon.com
	
//off to college--->//a[text()='Off to College']
//off to college--->//a[text()='Video Games']	
//best sellers-->//a[text()='Disability Customer Support']
//best sellers-->//a[text()='Best Sellers']	
//search field--->	//a[text()='Back to School']
	
//tag with inner:5
//www.bestbuy

//Deal of the Day---->//a[contains(text(), 'Store details')]
//Deal of the Day---->//a[contains(text(), 'Deal of the ')]
//order status--->//span[contains(text(), 'Long Islan')]
//order status--->//a[contains(text(), 'Find Another ')]
//top deal-->//a[contains(text(), 'Top Deals')]
	
//tag with attributes and use of contains:6	
//patient care-->//a[contains(@class, 'u1st-skipLink') ]
//patient care-->//div[contains(@id, 'stwrapper') ]	
//about the hospital-->	// i[contains(@class, 'fa fa-angle-d') ]//about the hospital-->		
	//about the hospital-->//div[contains(@class, 'navbar-brand')]
//search buttan--->//button[contains(@class, 'search-toggle global-search__btn--mobile global-search__btn--facility')]

//	starts with text:8
//	WWW.mountsinai

//patient care-->//p[starts-with(text(),'You can connect with a Mount Sinai doctor anytime from anywhere in the')]
	
//patient care-->//p[starts-with(text(),'Masks')]
	
//	WWW.walgreen
	
	//p[starts-with(text(),'Through our efforts we have seen that individuals with disabilities can ')]
	//p[starts-with(text(),'Over the last decade,')]
	//p[starts-with(text(),'Walgreens was recognized with a 100% score for the')]
	
	
	
	


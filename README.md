# 99-automation-appium

## Requirements
- AppiumStudio
- IDE
- JRE, JDK Library
- TestNG
- Device for testing

## Package Structure
```
├──  JRE System Library
├──  src
│   ├── android.ninetynine.config
│      └──  AndroidTestData.properties
│      └──  Config.properties
│   ├── android.ninetynine.ldp.enquiry
│   ├── android.ninetynine.srp.enquiry
│   ├── android.ninetynine.auth
│   ├── android.ninetynine.createlisting
│   ├── android.ninetynine.pagerendering
│   ├── android.ninetynine.login
│      └──  Regression_Login.java
│      └──  Regression_Logout.java
│   ├── android.ninetynine.pageobjects
│      └──  AssertEqual_List.java
│      └──  Login.java
│   ├── android.ninetynine.util
│      └──  Base_Test.java
│      └──  GeneralUtilities.java
├──  Referenced Libraries
├──  libs
├──  test-output
└──  testng.xml
└──  Feature_Enquiry_LDP.xml
└──  Feature_Enquiry_LDP_PhotoGalleryChat.xml
└──  Feature_Enquiry_LDP_StickyBarChat.xml
└──  Feature_Enquiry_LDP_StickyBarPhone.xml
└──  Feature_Enquiry_SRP.xml
└──  Feature_Enquiry_SRP_Chat.xml
└──  Feature_Enquiry_SRP_Phone.xml
```


**android.ninetynine.config** packages include :
  - *AndroidTestData.properties* is a file where we save the data that will we use in the automation. Such as username, password, URL, etc.
  - *Config.properties* is a file where we setup the app mobile setting from the appium to eclipse, such as APP_Package, APP_Activity, LocalHostURL and DeviceNumber.
  
  **android.ninetynine.pageobjects** This package where we placed our objects. It can be based on the feature, page, etc. The packages include :
  -  *AssertEqual_List.java* is a file where we write all verify method.
  -  *Login.java* is a file where we write objects in login flow. 
  
  **android.ninetynine.util** This package where we placed our objects. It can be based on the feature, page, etc. The package include :
  -  *Base_Test.java* is a file where we setting the app_package, app_activity to connect it to appium. 
  -  *GeneralUtilities.java* is a file where we write basic method that we will call it from page.objects package. Such a *click method*, *input method*, *verify method*, etc.

**android.ninetynine.login** This package where we placed our test case. It can be based on the feature, regression, etc. The package include :
  -  *Regression_Login.java* is a file where we write login test case.
  -  *Regression_Logout.java* is a file where we write logout test case.

**android.ninetynine.createlisting** This package where we placed create listing testcase.

**android.ninetynine.ldp.enquiry** This package where we placed LDP enquiry testcase.

**android.ninetynine.srp.enquiry** This package where we placed SRP enquiry testcase.

**android.ninetynine.ldp.pagerendering** This package where we placed page rendering enquiry testcase.

**Feature_Enquiry_LDP_PhotoGalleryChat.xml** this file is a suite TestNG for running all of LDP Enquiry PhotoGallery-Chat test cases.

**Feature_Enquiry_LDP_StickyBarChat.xml** this file is a suite TestNG for running all of LDP Enquiry StickyBar-Chat test cases.

**Feature_Enquiry_LDP_StickyBarPhone.xml** this file is a suite TestNG for running all of LDP Enquiry StickyBar-Phone test cases.

**Feature_Enquiry_LDP.xml** this file is a suite TestNG for running all of LDP Enquiry test cases.

**Feature_Enquiry_SRP.xml** this file is a suite TestNG for running all of SRP Enquiry test cases.

**Feature_Enquiry_SRP_Chat.xml** this file is a suite TestNG for running all of SRP Enquiry from Chat test cases.

**Feature_Enquiry_SRP_Chat.xml** this file is a suite TestNG for running all of SRP Enquiry from Phone test cases.

## Installation
1. Install all the requirements above.
2. Clone the repo

**AppiumStudio**
1. Connect the device to laptop
2. Open the device that appium read
3. In 'Application' section, click 'Import application from Android Device'
4. Search *app_package* that we want to test (in this case, the name is 'co.ninetynine.android.dev')
5. Click 'Import'

**IDE**
1. Open the project in IDE

## How to Run
**AppiumStudio**
1. Connect the device to laptop
2. Open the phone that already connected with appium
3. Make sure the emulator running 

**IDE**
1. Open android.ninetynine.login (this package were we save the test case)
2. Right click by one of the java file that we want to run
3. Run As > TestNG


## Appium Documentation on Confluence
https://99dotco.atlassian.net/wiki/spaces/9GE/pages/1210646529/Appium+Documentation

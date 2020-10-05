# 99-automation-appium

## Requirements
- AppiumStudio
- Eclipse
- JRE Library
- TestNG

## Package Structure
```
├──  JRE System Library
├──  src
│   ├── android.ninetynine.config
│      └──  AndroidTestData.properties
│      └──  Config.properties
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
```



**android.ninetynine.config** packages include :
  - *AndroidTestData.properties* is a file where we save the data that will we use in the automation. Such as username, password, URL, etc.
  - *Config.properties* is a file where we setup the app mobile setting from the appium to eclipse, such as APP_Package, APP_Activity, LocalHostURL and DeviceNumber.

**android.ninetynine.login** This package where we placed our test case. It can be based on the feature, regression, etc. The package include :
  -  *Regression_Login.java* is a file where we write login test case.
  -  *Regression_Logout.java* is a file where we write logout test case.

**android.ninetynine.pageobjects** This package where we placed our objects. It can be based on the feature, page, etc. The packages include :

  -  *AssertEqual_List.java* is a file where we write all verify method.
  -  *Login.java* is a file where we write objects in login flow. 
  
**android.ninetynine.util** This package where we placed our objects. It can be based on the feature, page, etc. The package include :
  -  *Base_Test.java* is a file where we setting the app_package, app_activity to connect it to appium. 
  -  *GeneralUtilities.java* is a file where we write basic method that we will call it from page.objects package. Such a *click method*, *input method*, *verify method*, etc.

## InstalLation
1. Install all the requirements above.
2. Clone the repo

**AppiumStudio**
1. Connect the device to laptop
2. Open the device that appium read
3. In 'Application' section, click 'Import application from Android Device'
4. Search *app_package* that we want to test (in this case, the name is 'co.ninetynine.android.dev')
5. Click 'Import'

**Eclipse**
1. Open the project in eclipse

## How to Run
**AppiumStudio**
1. Connect the device to laptop
2. Open the phone that already connected with appium
3. Make sure the emulator running 

**Eclipse**
1. Open android.ninetynine.login (this package were we save the test case)
2. Right click by one of the java file that we want to run
3. Run As > TestNG

AT-Android-Boilerplate Simply
-----------------

![Banner](asset/banner_android.png)

***
The AT-Android-Boilerplate look like simple framework of AT Android Team which support networking, download image, `annonation`, synching data with `RxJava` - `RxAndroid` and integrate `Circle CI`, `Travis CI`. It's simply for beginer learning base of Android Project in AT.

Table of Contents
-----------------
- [What we do](#what-we-do)
- [Features](#features)
- [Request Features](#request-features)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Practice](#practice)
- [Changelog](#changelog)
- [FAQ](#faq)
- [Contributing](#contributing)
- [License](#license)

What we do
-----------------
- Add library, tools support to `android project`.
- Integrate Circle CI, Travis CI.

Features
-----------------
- [Retrofit 2.2.0](https://github.com/square/retrofit)
- [Picasso 2.5.2](https://github.com/square/picasso)
- [Android Annontations 3.2](https://github.com/androidannotations/androidannotations)
- [RxJava and RxAndroid 2.x](https://github.com/ReactiveX/RxAndroid)
- [Otto](https://github.com/square/otto) (Deprecated using RxJava instead, see [here](http://blog.kaush.co/2014/12/24/implementing-an-event-bus-with-rxjava-rxbus/))
- [Circle CI](https://circleci.com/)
- [Travis CI](https://travis-ci.org/)
- `Checkstyle`, `PMD` and `Findbugs` for code analysis.

Request Feature:
-----------------
- Add Unittest.
- Improve `MVC`, `MVP`, `MVVM` models.
- Remove `Android Annonations` and using `Java 8` instead.
- Add base some of `Design pattern`.

Prerequisites
-----------------
- **OS** : `Mac OS`, `Linux`, `Windows`.
- **SDK** :  Android SDK 25 and above.
- **IDE** : Android Studio 2.3 and above.
- **Enviroment** : Java JDK 1.8 and above.

Getting Started
-----------------
If you guys want to create new project with this boilerplate, you must follow this steps one by one:

- Clone this repository from GitHub via `command line` or `download` from GitHub page.

	```bash
	# Get the latest snapshot
	git clone https://github.com/at-kietvo/AT-Android-Boilerplate-Simply `YourProjectName`
	```
- Import that project to `Android Studio` IDE.
	
- Rename some information related with `your project`.

	- `packagename`, default `vn.asiantech.androidboilderplate`.
	
		- Right click to package in project tools.
		
			![](https://github.com/at-kietvo/AT-Android-Boilerplate-Simply/raw/master/choose_rename.png)	
		- Refactor -> Rename -> Choosing rename package.
		
	- `applicationId` in `build.gradle`
	
		> /app/build.gradle
	- `AndroidManifest.xml`

		> /src/main/AndroidManifest.xml
	- `proguard-rules.pro`
		
		> /app/proguard-rules.pro

- Enjoy Boilerplate with your life coding.

Project Structure
-----------------
- See structure of project tree.

	![](https://github.com/at-kietvo/AT-Android-Boilerplate-Simply/raw/master/android_struct.png)
	
- Resource structure

	| Name         | Path                      | Description |
	| --------     | -----------               | ----------- |
	| XML Layouts  | `res/layout/`             | This is where we put our XML layout files.     |
	| XML Menus    | `res/menu/`               | This is where we put our AppBar menu actions.  |
	| Drawables    | `res/drawable`            | This is where we put images and XML drawables. | 
	| Colors       | `res/values/colors.xml`   | This is where we put [color definitions](http://developer.android.com/guide/topics/resources/more-resources.html#Color). |
	| Dimensions   | `res/values/dimens.xml`   | This is where we put [dimension values](http://developer.android.com/guide/topics/resources/more-resources.html#Dimension). | 
	| Strings      | `res/values/strings.xml`  | This is where we put strings.           |
	| Styles       | `res/values/styles.xml`   | This is where we put style values.      |

Practice
-----------------
I always put `sample` code inside this project, let take deep look at `root` of package.

Some `demo` I will putting here if needed.

If you guys want to make a demo, feel free for open new pull request.

Changelog
-----------------
### 1.0.0 (May 19, 2017)
- Init first project.
- Created Readme.md file.
- Added [Retrofit 2.2.0](https://github.com/square/retrofit)
- Added [Picasso 2.5.2](https://github.com/square/picasso)
- Added [Android Annontations 3.2](https://github.com/androidannotations/androidannotations)
- Added [RxJava and RxAndroid 2.x](https://github.com/ReactiveX/RxAndroid)
- Added [Otto](https://github.com/square/otto) (Deprecated using RxJava instead, see [here](http://blog.kaush.co/2014/12/24/implementing-an-event-bus-with-rxjava-rxbus/))
- Added [Circle CI](https://circleci.com/)
- Added [Travis CI](https://travis-ci.org/)
- Added  `Checkstyle`, `PMD` and `Findbugs` for code analysis.

FAQ
-----------------
If you guys want to asking some question, feel free create new issue, I will reply asap. Thank a lot.

Contributing
------------
If something is unclear, confusing, or needs to be refactored, please let me know via Email, Skype asap.

Pull requests are always welcome, but due to the opinionated nature of this project, I cannot accept every pull request. 

Please open an issue before submitting a pull request.

License
-------
None.

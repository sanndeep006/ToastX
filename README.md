# ToastX
A regular toast with custom views.

## Dependency
Download this module and paste it in root directory of your project.
Add this to your app's `build.gradle` file

```gradle
dependencies {
	...
	implementation project(':toastx')
	...
}
```
## Usage
It has three methods which will return a toast object.

Normal Toast :

``` java
ToastX.normal(yourContext, "Normal Toast").show();
```

Success Toast :

``` java
ToastX.success(yourContext, "Success Toast").show();
```

Error Toast :

``` java
ToastX.error(yourContext, "Normal Toast").show();
```

Custom Toast :

``` java
ToastX.customToast(yourContext, "Custom Toast", hasIcon:boolean, iconRes:int, backgroundRes:int).show();
```

## Screenshots

These are the 3 different toasts.

<img src="https://raw.githubusercontent.com/pruthvi-21/ToastX/master/screenshots/all.png">

This is a custom toast :

<img src="https://raw.githubusercontent.com/pruthvi-21/ToastX/master/screenshots/CustomToast.png">

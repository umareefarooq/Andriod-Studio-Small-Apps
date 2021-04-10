# Andriod-Studio-Small-Apps

   This repositopry contains small Apps and Projects that I have developed in Andriod Studio.

## Activity Life Cycle

   Android Activity Lifecycle is controlled by 7 methods of android.app.Activity class. The android Activity is the subclass of ContextThemeWrapper class.An activity  is the single screen in android. It is like window or frame of Java.By the help of activity, you can place all your UI components or widgets in a single screen.  
          

  

### Android Activity Lifecycle methods

   *Let's see the 7 lifecycle methods of android activity*

1. **onCreate**	is called when activity is first created.
2. **onStart** is called when activity is becoming visible to the user.
3. **onResume**	is called when activity will start interacting with the user.
4. **onPause**	is called when activity is not visible to the user.
5. **onStop** is	called when activity is no longer visible to the user.
6. **onRestart** iscalled after your activity is stopped, prior to start.
7. **onDestroy** iscalled before the activity is destroyed.


## Addition App

   This App simply takes two integirs and them them. the sum of the numbers is shown in the App.
   
## Button Event App
 
   This App has a button, which changes and displayes the text when it is clicked. After clicking the button, some text message is shown in the TextView below.

## Changing Images

   This app has two image views with pictures already in place. Below each image, there is a button, which is used to change the picture when it is clicked.
   And same is the case with the second picture.
   
## CheckBox App

   This Simple App is about Checkbox, and one of its important functionality, i.e. isChecked.
   The App simply features a checkbox and a button, which has onClick functionality coded in the backend, i.e. java.
   When the user clicks the "Check" button, the app will pop up a toast message telling about whether the checkbox is checked or not.

##  Checkbox & Radio Button App

   This small App takes two user inputs, i.e. the size and color of some given product.
   after checking the radio buttons, and the checkbox, when the user clicks on the "Order" button; the app 
   throws a toast message showing which size and color the user have chosen. right after that, another toast message pops up- showing if the user had click 
   the "I agree to the terms" checkbox or not. Also, if the user try to click the "Order" button without selecting any size and colour, then the app will 
   not crash, but simply show a toast message saying, "Select Size & Colour."
   
 ## Click Listener On Dynamic Content Static Layout Listview
 
   In this app, two Click listeners are implemented.
   The first one is simple click listener while the second one is long click listener.
   
   
 ## Custom Layout App
   
   This app is for the demonstration of 3rd type of list views, which is dynamic content dynamic layout
   
 ## Dynamic Content Dynamic Layout ListView
 
   Dynamic Content Dynamic Layout Implementation steps

   Fisrt step >  define and design a custom layout. (only for one entry of the list. the rest will replicate the same layout).
   
   Second step > in the main layout, define the listview.
   
   Third step > in main activity: nested class extended from base adapter and will override 4 methods.

## Dynamic ListView App

  Implemented using 2nd type of listviews, i.e. dynamic content static layout.
  
   It has 3 steps:
   
   Step 1 is data source.
   
   Step 2 is array adaptor.
   
   Step 3 is connect listview with corresponding adaptor.
    
 ## Getting Input
 
   This app performs a simple task of getting a user input in an edittext, which is then displayed in a textview after user clicks the button.
   
 ## Implicit Intent App
 
   
   This app has 3 buttons, whcih has onClick functionalities coded on the backend. 
   The onclick has different functions defining different types of implicit intents.
   The implicit intent takes two paramenters, which are the "Action" and the "Uri" in the form of 

   Uri uri = Uri.parse("http://www.google.com");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
        
   Uri is the datatype for intents. it takes different types of data depending upon the need of the intent.

   It takes 'http' along with a link for opening other websites. The action used for opening another website or map coordinates will be "ACTION_VIEW".
   
   It takes 'geo' along with longitudues and latitudes for opening other map coordinates. The action used for opening another website or map coordinates will be            "ACTION_VIEW".
   
   It takes 'tel' along with a phone number for opening a dailer. The action used for opening a dailer will be "ACTION_DIAL".

## Login App

This App simple contains the Login page without any functionality.

## Radio group & Radio Button App

   This app is about radio group and raadio buttons.
   The concept is described by taking the radion group, i.e. gender, which had two radio buttons, i.e. male and female.
   wHen the user clicks the "check" button; the app pop ups a toast message showing which gender is selected.
   If the user clicks the "check" button without checking any radio button, then the app will show a toast message saying, "select a gender" rather than just crashing.
   
## Static ListView App

   
   First type of listview, i.e. static. (only works with string arrays)
    
   Three steps to implement static listview
     
  Step 1 is to make a listview in activity.xml
  
  Step 2 is to make a string-array in resources/values/string.xml
  
  Step 3 is to link the string-array from step 2 to listview using the entries attribute.

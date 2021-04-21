# Andriod-Studio-Small-Apps

   This repositopry contains small Apps and Projects that I have developed in Andriod Studio.

## Activity Life Cycle

   Android Activity Lifecycle is controlled by 7 methods of android.app.Activity class. The android Activity is the subclass of ContextThemeWrapper class.An activity  is the single screen in android. It is like window or frame of Java.By the help of activity, you can place all your UI components or widgets in a single screen.  
          

  

### Android Activity Lifecycle methods

   *Let's see the 7 lifecycle methods of android activity:*

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
   
   This app is for the demonstration of 3rd type of list views, which is dynamic content dynamic layout.
   
 ## Dynamic Content Dynamic Layout ListView
 
   Dynamic Content Dynamic Layout Implementation steps:

   Fisrt step >  define and design a custom layout. (only for one entry of the list. the rest will replicate the same layout).
   
   Second step > in the main layout, define the listview.
   
   Third step > in main activity: nested class extended from base adapter and will override 4 methods.

## Dynamic ListView App

  Implemented using 2nd type of listviews, i.e. dynamic content static layout.
  
   It has 3 steps:
   
   Step one is to make a data source.
   
   Step two is to define and create an array adaptor.
   
   Step three is to connect listview with corresponding adaptor.
   
  ## Explicit Intent App  
  
   
   In this App, the concept of explicit intent is explained along with how the data is transfered and retreived from one activity to another one.
   Explicit intents are used for switching from one activity to another in the same App.
   The main activity has a simple button which has an onClick method, where the creation of explicit intent is implemented.
   Also, the main activity has some key value pair data which is tranfered into the second activity via .putExtra method and is retrieved and shown in the second    activity via the .getStringExtra and .getIntExtra methods.

   The context of Explicit Intent is given below;
  
    Intent intentObject = new Intent(Context, targetActivity.class);
    
 ## Getting Input
 
   This app performs a simple task of getting a user input in an edittext, which is then displayed in a textview after user clicks the button.
   
 ## Implicit Intent App
 
   
   
This app has 3 buttons, whcih has onClick functionalities coded on the backend. 
The onclick has different functions defining different types of implicit intents.
The implicit intent is implemented in two steps, which are the "Action" and the "Uri".

The syntax of Implicit Intent is given below;

         Uri uri = Uri.parse("http://www.google.com");
         Intent it = new Intent(Intent.ACTION_VIEW,uri);
         startActivity(it);
        
Uri is the datatype for intents. it takes different types of data depending upon the need of the intent.

  It takes 'http' along with a link for opening other websites. The action used for opening another website or map coordinates will be "ACTION_VIEW".
  It takes 'geo' along with longitudues and latitudes for opening other map coordinates. The action used for opening another website or map coordinates will be         "ACTION_VIEW".
  It takes 'tel' along with a phone number for opening a dailer. The action used for opening a dailer will be "ACTION_DIAL".
  
## Instance State Lost App

   This app demonstractes the concept of data lost during the the configuration changes with respect to the activity life cycle.
   When an application is running and th phone configuration is changed; i.e. rotating the phone, changing local langugae, and activating multi windowmode etc,   then the data received from any sort of event handling is lost. E.g. if the user inputs some data in the text views and is shown on the screen below, then the data  after the click event will be lost if the user rotate the phone.
   When the configuration is changed, the activity is killed and then restarted. In the event of this, the following methods are executed in the below given order:

      OnPause > OnStop > OnDestroy > OnCreate > OnStart > OnResume


## Login App

This App simple contains the Login page without any functionality.

## On Activity Result App

   
   This app has two activities. The functionality of this app is that it asks the user to click a button which will take the user to another activity.
   In the next activity, the user will be asked to type some message and after clicking the "Submit Text" button there, the text will be taken from that activity    and
   shown in a textview in the first activity. This is done through a method called "onActivityResult".

## Option Menu With onClick Functionality

   
For creating an option menu in the app, first create an andriod resourse directory. Within the directory, create a resourse of the type menu class. In that menu type file/resourse, create the items that you want to show in the option menu in the exact same order. After doing so, run the following code in the main activity:

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
        
This will create an option menu in the app.
Also, to make the items in the menu clickable, implement the below function and code it according to your logic or needs:

        // method for the click listener on Option Menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
    
                if(item.getItemId()==R.id.item1)
                {
                    //Logic here
                }
                if(item.getItemId()==R.id.item2)
                {
                     //Logic here
                }
                if(item.getItemId()==R.id.item3)
                {
                     //Logic here       
                }
                return super.onOptionsItemSelected(item);
    }

   
## Popup Menu With onClick Functionality  
   
   

For creating a Popup menu in the app, first create an andriod resourse directory. Within the directory, create a resourse of the type menu class. In that menu type file/resourse, create the items that you want to show in the option menu in the exact same order. After doing so, run the following code in the main activity:

        PopupMenu popup = new PopupMenu(MainActivity.this, view);
        popup.getMenuInflater().inflate(R.menu.popupmenu, popup.getMenu());
        popup.show();
        
This will create a Popup menu in the app.
Also, to make the items in the menu clickable, implement the below function and code it according to your logic or needs:

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem)
            {

                if(menuItem.getItemId()==R.id.one)
                {
                    //Logic here
                }
                if(menuItem.getItemId()==R.id.two)
                {
                    //Logic here   
                }
                if(menuItem.getItemId()==R.id.three)
                {
                    //Logic here
                }
                return true;
            }
            )};


   
## Radio group & Radio Button App

   This app is about radio group and raadio buttons.
   The concept is described by taking the radion group, i.e. gender, which had two radio buttons, i.e. male and female.
   wHen the user clicks the "check" button; the app pop ups a toast message showing which gender is selected.
   If the user clicks the "check" button without checking any radio button, then the app will show a toast message saying, "select a gender" rather than just crashing.
   
# Shared Preferences App


   Shared Preferences is used to store and retrieve small amounts of primitive data
   as key/value pairs to a file on the device.
   Primarily used for saving Application Settings & User Information. The data will be available across user sessions even if the application is killed.
   These preferences are stored in XML files in the Android file system as follows:

      Data/data/<package_name>/shared_prefs/<pref filename>.xml

   In this App, the first activity takes some input from the user, which is then saved into a shared preference and also shown in an EditText in the second activity.

   
## Static ListView App

   
   First type of listview, i.e. static. (only works with string arrays)
    
   Three steps to implement static listview:
     
  Step 1 is to make a listview in activity.xml
  
  Step 2 is to make a string-array in resources/values/string.xml
  
  Step 3 is to link the string-array from step 2 to listview using the entries attribute.

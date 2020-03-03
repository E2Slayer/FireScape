# FireScape

FireScape is a mobile version of the wildfires alerting system that I and my teammates have created during ProfHacks 2020 at Rowan University in New Jersey.

## Getting Started

### Built With

```
Android Studio 3.6
SDK Version 26(Android 8.0(Oreo))
FireBase
Python 3.7
```

### Installing

Download or clone the repository first

Before you procede to the next step, you have to set up data for your FireBase.

Go to ./pythonscripts and edit firecon.py 
```
credentials.Certificate('friescape-firebase-adminsdk.json')

'databaseURL': 'https://friescape.firebaseio.com'
```

You have to change them to your FireBase certification and database URL. 
If you do not know how to set the FireBase credentials, please check the website below.
```
https://firebase.google.com/docs/admin/setup
```
Once you are done with editing the python script, please run it to enter data to your database.

Next, you have to set the Google Maps API and FireBase database for Android Studio.

In values.xml, you may change the line 
```
<string name="firebase_database_url" translatable="false">Your_DataBase_Here</string>
<string name="google_api_key" translatable="false">Your_Key_Here</string>

```

Finally, you may want to run a FireBase setup assist from Android Studio
```
Tools->FireBase->RealTime DataBase->Save and retrieve Data
```

Now, you are good to go!

## DevPost

You may find more details on the DevPost link[FireEscape](https://devpost.com/software/firescape-7y4hsd)

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the GNUv3 License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Many of Things are inspired by [Location Tracker](https://github.com/AnuradhaIyer/Location-Tracker) by AnuradhaIyer.



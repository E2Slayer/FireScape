import firebase_admin
import csv
from firebase_admin import credentials
from firebase_admin import db





# Fetch the service account key JSON file contents
cred = credentials.Certificate('friescape-firebase-adminsdk.json')

# Initialize the app with a service account, granting admin privileges
firebase_admin.initialize_app(cred, {
    'databaseURL': 'https://friescape.firebaseio.com'
})

# As an admin, the app has access to read and write all data, regradless of Security Rules
ref = db.reference('restricted_access/secret_document')
print(ref.get())

# Get a database reference to our blog.
ref = db.reference('server/firedata')


users_ref = ref.child('australia')

with open('fire_nrt_M6_107573.csv','rt') as f:
  data = csv.DictReader(f)
  i = 0
  for row in data:
        #print(row['latitude'], row['longitude'])
        users_ref.child(str(i)).set({
                'latitiude': row['latitude'],
                'longitude': row['longitude'],
                'acq_date': row['acq_date']
        })
        i = i+1

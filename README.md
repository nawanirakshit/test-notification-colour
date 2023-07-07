# test-notification-colour
App killed state icon colour issue

Steps to reproduce

Kill the from recent state

Fetch token from Logcat

Send the push notification from Postman using following data 


  curl --location 'https://fcm.googleapis.com/fcm/send' \
--header 'Content-Type: application/json' \
--header 'Authorization: key=AAAAKCu3NmI:APA91bFNgb_hz8Il4gUD-Y8er4xzdBpZ1tqGee5asLNK5DrJqYEodA7erBeraoUE3bENdgXHGWmmVQSl5IBrW53jC7U9joDd5kdSRea-kRMZ255_NMsAA649JJ1gcLKrOVy_zEifr53d' \
--data '{
    "registration_ids": [
        "Paste Token fetched from Logcat"
    ],
    "notification": {
        "title": "Congratulations",
        "body": "YOU’VE EARNED 15 POINTS"
    },
    "data": {
        "type": "points",
        "points": 5,
        "title": "Congratulations",
        "short_title": "YOU’VE EARNED 15 POINTS",
        "description": "YOU’VE EARNED 15 POINTS",
        "capping_info": "You'\''ve completed 5 Quizzes. This is the maximum number of quizzes you can complete for a month."
    }
}'

Send Postman request

Observe push notification icon is of different color which was set in Manifest. 

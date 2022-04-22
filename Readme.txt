HOW TO RUN :
1. Open the "PostREST" Project using IDE, and run it.
2. After "PostREST" project is running succesfully, open POSTMAN application.
3. And Then Import Collection "AccelByte.postman_collection". (Home > Import an Existing file)
4. And Then Click button Send to Run the API


FUNCTIONAL TEST Using POSTMAN:
1. Only POST Method is Allowed
2. The only accepted endpoint format is gameCode, gameName, publisher, category, and platform
3. gameCode is Unique. if user create new gameCode that already exist, so the Response Code 409 will be returned.
4. gameCode only accept alphanumeric, and maximun char is 20.
5. gameName, publisher, and category can accept any character, and maximum char is 50.
6. platform is not array of string yet, but already accept maximum char is 20.
7. Response code 201 will be returned as POST is successfull and the request payload will be returned too.


REASON USING POSTMAN:
1. Because easy to use, user friendly.
2. And I had ever used postman before for API testing
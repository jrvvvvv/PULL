import pymongo
from pymongo import MongoClient

practice1 = MongoClient("mongodb+srv://jravillanueva:<zgj1OlbWfcyqOHhv>@practice1.b6tu75p.mongodb.net/?retryWrites=true&w=majority")
db = practice1["user"]
collection = db["user"]



user1 = {"_id":5, "username":"johnreynan19"}

collection.insert_one(user1)


#if(Username == user1):
 #    if(Password == pass1):
  #      print('Hello'+user1+"! Welcome!")
   #  else:
    #    print("Username and password don't match")
 
#else:
 #
 # 
 #   print("We don't have that username, please try again")

#while(Username != user1):
 # Username=input("Username: ")
  #if(Username == user1):
   # Password=input("Password: ")
    #if(Password == pass1 ):
     # print('Welcome! '+ user1)
      #break
    #else:
     # print('Username and Password dont match')
      #continue
  #else:
   # print('We dont have that username,please try again')
    #continue
    
Username=input("Please input username: ")


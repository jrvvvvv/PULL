from tkinter import *
from tkinter import messagebox
import tkinter
import os
import requests
from datetime import datetime
import json

user1='johnreynan19'
pass1='johnreynan19'

userBox1 = None
passBox2 = None

mainWindow=None
menuWindow=None
weatherWindow=None


##FUNCTIONS



def main():
 global mainWindow 
 mainWindow= Tk()
 mainWindow.geometry('400x400')
 mainWindow.resizable(width=FALSE,height=FALSE)
 mainWindow.eval('tk::PlaceWindow . center')
 mainWindow.title("Login")

 def loginFunction():
     try:
      if(userBox1.get() == user1):
          if(passBox2.get()== pass1):
               messagebox.showinfo("Welcome!","Welcome! "+user1+ '!')
               mainWindow.destroy()
               menu()
          elif(passBox2.get()== ""):
              messagebox.showinfo("Blank Password.","Input Password.")
          else:
               messagebox.showinfo("Invalid Account!","Username and Password don't match")
               clearPassbox()
      elif(userBox1.get() == ""):
            messagebox.showinfo("Blank Username","Blank Username, Please input a username.")

      else:
           messagebox.showinfo("Username Invalid","We don't have that username")   
           clearTextbox()   
     except:
              messagebox.showerror("Error!","An error occured!")



 def clearTextbox():
    userBox1.delete(0,END)
    passBox2.delete(0,END)

 def clearPassbox():
     passBox2.delete(0,END)

##TEXTS IN MAIN
 mainWindowText1=Label(
     mainWindow,
     text="Welcome!",
     fg="white",
     bg="black",
     )
 mainWindowText1.pack()
 mainWindowText1.place(x=175,y=15)
  

 usernameLabel=Label(
     mainWindow,
     text="Username: ",
 )
 usernameLabel.pack()
 usernameLabel.place(x=35,y =75)

 passwordLabel=Label(
     mainWindow,
     text="Password: ",
 )
 passwordLabel.pack()
 passwordLabel.place(x=35,y =100)




##TEXTBOX

 userBox1=Entry(width=30,bg="pink")
 userBox1.pack()
 userBox1.place(x=100,y=75)
 userBox1.insert(0,"")
 

 passBox2=Entry(width=30,bg='pink')
 passBox2.pack()
 passBox2.place(x=100,y=100)
 passBox2.insert(0,"")
 


    ##BUTTONS
 loginButton=Button(mainWindow,text="Login",command=loginFunction,
                  fg="black",
                  bg='Yellow')
 loginButton.pack()
 loginButton.place(x=150,y=135)

##adsadsad
 
 mainWindow.mainloop()


def menu():
 global menuWindow

 menuWindow= Tk()
 menuWindow.geometry('400x400')
 menuWindow.resizable(width=FALSE,height=FALSE)
 menuWindow.eval('tk::PlaceWindow . center')
 menuWindow.title("Menu")


 def maps():
     try:
      messagebox.showinfo("Information","You will proceed with the browser")
      os.system("start \"\" https://maps.google.com")
      

     except:
      messagebox.showerror('Error','Unexpected Error')

 def weather():
    try:
        global weatherWindow
        
        weatherWindow=Tk()
        weatherWindow.geometry('400x400')
        weatherWindow.resizable(width=FALSE,height=FALSE)
        weatherWindow.eval('tk::PlaceWindow . center')
        weatherWindow.title("Weather")


        city_value = StringVar()

        def time_format_for_location(utc_with_tz):
            local_time = datetime.utcfromtimestamp(utc_with_tz)
            return local_time.time()
        
        city_value = StringVar()
        
        def showWeather():
    #Enter you api key, copies from the OpenWeatherMap dashboard
            api_key = "55fc2deed09d8d1242fb2135f6f322c7"  #sample API
 
    # Get city name from user from the input field (later in the code)
            city_name=city_value.get()
 
    # API url
            weather_url = 'http://api.openweathermap.org/data/2.5/weather?q=' + city_name + '&appid='+api_key
 
    # Get the response from fetched url
            response = requests.get(weather_url)
 
    # changing response from json to python readable 
            weather_info = response.json()
 
 
            tfield.delete("1.0", "end")   #to clear the text field for every new output
 
#as per API documentation, if the cod is 200, it means that weather data was successfully fetched
 
            if weather_info['cod'] == 200:
                kelvin = 273 # value of kelvin
 
#-----------Storing the fetched values of weather of a city
 
                temp = int(weather_info['main']['temp'] - kelvin)                                     #converting default kelvin value to Celcius
                feels_like_temp = int(weather_info['main']['feels_like'] - kelvin)
                pressure = weather_info['main']['pressure']
                humidity = weather_info['main']['humidity']
                wind_speed = weather_info['wind']['speed'] * 3.6
                sunrise = weather_info['sys']['sunrise']
                sunset = weather_info['sys']['sunset']
                timezone = weather_info['timezone']
                cloudy = weather_info['clouds']['all']
                description = weather_info['weather'][0]['description']
 
                sunrise_time = time_format_for_location(sunrise + timezone)
                sunset_time = time_format_for_location(sunset + timezone)
 
#assigning Values to our weather varaible, to display as output
         
                weather = f"\nWeather of: {city_name}\nTemperature (Celsius): {temp}°\nFeels like in (Celsius): {feels_like_temp}°\nPressure: {pressure} hPa\nHumidity: {humidity}%\nSunrise at {sunrise_time} and Sunset at {sunset_time}\nCloud: {cloudy}%\nInfo: {description}"
            else:
                weather = f"\n\tWeather for '{city_name}' not found!\n\tKindly Enter valid City Name !!"
 
            tfield.insert(INSERT, weather) 

        city_head= Label(weatherWindow, text = 'Enter City Name', font = 'Arial 12 bold').pack(pady=10) #to generate label heading
 
        inp_city = Entry(weatherWindow, textvariable = city_value,  width = 24, font='Arial 14 bold')
        inp_city.pack()
 
 
        Button(weatherWindow, command=showWeather, text = "Check Weather", font="Arial 10", bg='lightblue', fg='black', activebackground="teal", padx=5, pady=5 ).pack(pady= 20)
 
#to show output
 
        weather_now = Label(weatherWindow, text = "The Weather is:", font = 'arial 12 bold').pack(pady=10)
 
        tfield = Text(weatherWindow, width=46, height=10)
        tfield.pack()

        weatherWindow.mainloop()

    except:
        messagebox.showerror('Error','Unexpected Error')


 mapsButton=Button(menuWindow,text="Maps",command=maps,
                   fg='Black',
                   bg='green')
 mapsButton.place(x=160,y=100)
 

 weatherButton=Button(menuWindow,text="Weather",command= weather,
                      fg='black',
                      bg='pink')
 weatherButton.place(x=160,y=140)


 menuUser=Label(menuWindow,
                text=user1,
                fg="pink",
                bg="black")
 menuUser.place(x=5,y=0)

 menuWindow.mainloop()

menu()
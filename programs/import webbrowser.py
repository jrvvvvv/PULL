from tkinter import *
from tkinter import messagebox
import tkinter

mainWindow = None

##FUNCTIONS
def exitFunction():
     global mainWindow
     print('PROGRAM CLOSED..')
     messagebox.showinfo("Program Closed","Program Closed")
     mainWindow.destroy()

def main():
 global mainWindow
 mainWindow= Tk()
 mainWindow.geometry('400x400')
 mainWindow.resizable(width=FALSE,height=FALSE)
 mainWindow.eval('tk::PlaceWindow . center')

 ##TEXTS IN MAIN
 mainWindowText1=Label(
     mainWindow,
     text="Welcome!",
     fg="white",
     bg="black",
     )
 mainWindowText1.pack()
 mainWindowText1.place(x=175,y=15)
 
 

##TEXTBOX

 userBox1=Entry(width=30,bg="pink")
 userBox1.pack()
 userBox1.place(x=100,y=75)
 userBox1.insert(0,"Username: ")
 

 passBox2=Entry(width=30,bg='pink')
 passBox2.pack()
 passBox2.place(x=100,y=100)
 passBox2.insert(0,"Password: ")
 

  ##BUTTONS
 exitButton= Button(mainWindow,text="Tanginamopo",command=exitFunction,
                  fg="black",
                  bg='Yellow')
 exitButton.pack()
 exitButton.place(x=150,y=135)

 
    
 mainWindow.mainloop()
  

 

main()
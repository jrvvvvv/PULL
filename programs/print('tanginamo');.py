def ulet(name):
    name1=('ANG SARAP MO ' + name)
    print (name1)



sex =''
name= input('My name is: ')


while(sex != 'male') and (sex != 'female'):
  print('Sex: ')
  sex = input('')



birthday= input('Birthday: ')

print ('Name: ',name,'\nSex: ', sex, '\nBirthday: ',birthday )

while True:
    print('Choose if what you want to replay?')
    print('(a)Name\n(b)Sex\n(c)Birthday')
    choose=input()
    if(choose == 'a'):
     print (name)
     ulet('julius babao')
     
    elif(choose == 'b'):
     print(sex)
     
    elif(choose =='c'):
     print(birthday)
    
    else:
        continue







 


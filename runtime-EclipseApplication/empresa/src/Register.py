from tkinter import *
from tkinter import ttk
import tkinter as tk

root = Tk()
root.title('RegisterView')
root.geometry("600x600")

label1 = Label(root, text='Nombre')
label1.config(width=6, height=1,font=('Arial', 11, 'bold'))
label1.place(x=14, y=14)

label2 = Label(root, text='Apellido')
label2.config(width=6, height=1,font=('Arial', 11, 'bold'))
label2.place(x=14, y=62)

button1 = Button(root, text='Registrar')
button1.config(width=20,height=1, font=('Arial', 12, 'bold'),  fg='red', activebackground = 'red')
button1.place(x=170, y=314)

entry1 = Entry(root)
entry1.place(x=170, y=14, width=211,height=20)

entry2 = Entry(root)
entry2.place(x=170, y=62, width=211,height=20)

checkbutton1 = Checkbutton(root, text='Soltero(a)')
checkbutton1.config(width=6,height=1)
checkbutton1.place(x=170, y=104)

label3 = Label(root, text='Estado Civil')
label3.config(width=10, height=1,font=('Arial', 11, 'bold'))
label3.place(x=14, y=110)

checkbutton2 = Checkbutton(root, text='Casado(a)')
checkbutton2.config(width=6,height=1)
checkbutton2.place(x=272, y=104)

checkbutton3 = Checkbutton(root, text='Divorciado(a)')
checkbutton3.config(width=10,height=1)
checkbutton3.place(x=374, y=104)

radioButton1 = Radiobutton(text='Hombre', value='1')
radioButton1.place(width=120,height=20, x=272, y=146)

radioButton2 = Radiobutton(text='Mujer', value='2')
radioButton2.place(width=120,height=20, x=170, y=146)

label3 = Label(root, text='Genero')
label3.config(width=10, height=1,font=('Arial', 11, 'bold'))
label3.place(x=2, y=152)

comboBox1 = ttk.Combobox(root, state="readonly")
comboBox1.place(x=170, y=194)

label4 = Label(root, text='Ciudad')
label4.config(width=9, height=1,font=('Arial', 11, 'bold'))
label4.place(x=2, y=200)

spinBox1 = ttk.Spinbox(root, from_=0,to=100)
spinBox1.place(x=170, y=236)

label5 = Label(root, text='Edad')
label5.config(width=8, height=1,font=('Arial', 11, 'bold'))
label5.place(x=2, y=236)

separator1 = ttk.Separator(root, orient='horizontal')
separator1.place(x=0, y=386, relwidth=1, relheight=0.001)

treeview = ttk.Treeview(root, columns=('','',''))
treeview.place(x=-10, y=434)
treeview.heading('#0', text='Nombre')

treeview.heading('#1', text='Apellido')

treeview.heading('#2', text='Genero')

treeview.heading('#3', text='Edad')



root.mainloop()

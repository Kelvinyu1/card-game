import tkinter as tk 
from Player import Player
name =""
cash =0
def open_new_screen():
    for widget in window.winfo_children():
        widget.destroy()
    
    name_label = tk.Label(text="Name")
    entry_name = tk.Entry()
    money_label = tk.Label(text="Cash amount")
    entry_money = tk.Entry()
    name_label.pack()
    entry_name.pack()
    money_label.pack()
    entry_money.pack()
    
    def display_name_cash():
        global name, cash
        name = entry_name.get()
        cash = entry_money.get()
        displayname()
    
    button2 = tk.Button(text="Continue?", command=display_name_cash)
    button2.pack()

def displayname():
    for widget in window.winfo_children():
        widget.destroy()
    n = tk.Label(text=name, width=15)
    c = tk.Label(text=cash, width=15)
    n.pack()
    c.pack()

window = tk.Tk()

welcome_message = tk.Label(
    text="Simple Card Game made by me",
    fg="white",
    bg="green",
    width=40,
    height =20
)
welcome_message.pack()

button = tk.Button(
    text="Click me to start",
    width = 15,
    height = 10,
    fg="white",
    bg="blue",
    command=open_new_screen
)
button.pack()

hand = ["ace", "king"]
player = Player(name, cash, hand)



window.mainloop()
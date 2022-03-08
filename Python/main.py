from car import Car
from account import Account
from uberX import UberX

if __name__=="__main__":
    print("Hola bienvenido a Uber")
    uberX = UberX("AMS234", Account("Sergio Pérez","RED123"), "Ferrari", "Modena")  
    print(vars(uberX))
    print(vars(uberX.driver)) 

    uberX2 = UberX("QWE567", Account("Max Verstappen","RED145"), "Mercedes","McLaren")
    print(vars(uberX2))
    #print(uberX2.driver)

    

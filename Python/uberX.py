from car import Car

class UberX(Car):
    brand = str
    model = str

    def __init__(self, license, driver, brand, model):
        Car.__init__(license, driver)
        self.brand = brand
        self.model = model
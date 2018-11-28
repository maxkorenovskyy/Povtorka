from packages.Package import *
from enums.PackageType import *


class Bag(Package):
    package_type = PackageType.BAG
    max_weight = 0


    def __init__(self, price, producer, material, volume, max_weight):
        self._price = price;
        self._producer = producer;
        self.material = material
        self.volume = volume
        self.max_weight = max_weight


    def __str__(self):
        return "Type of package:"+ str(self.package_type) +"    Price: " + str(self._price) + "  Producer: " + str(
            self._producer) + " Material: " + self.material + " Volume: " + str(self.volume)+" Maximal weight: " + str(self.max_weight)

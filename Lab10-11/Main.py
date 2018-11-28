from packages.Bottle import Bottle
from packages.Box import Box
from packages.Bag import Bag
from Manager import *

if __name__ == '__main__':
    manager = Manager()

    box1 = Box(30.00, "producer1", "metal", 3.00, 20.00, 10.00, 15.00)
    box2 = Box(15.00, "producer2", "cardboard", 0.40, 10.00, 5.00, 8.00)
    bag1 = Bag( 13.00, "producer1", "paper",20.00, 30.00)
    bag2 = Bag(13.00, "producer3", "plastic", 40.00, 60.00)
    bottle1 = Bottle(20.00, "producer1", "glass", 1.00, "stopper")
    bottle2 = Bottle(10.00, "producer2", "plastic", 1.50, "plastic cap")

    manager.list_of_packages = [box1, box2, bag1, bag2, bottle1, bottle2]
    print("Initial list:")
    manager.print_list()
    manager.sort_by_volume()
    print("Sorted by volume:")
    manager.print_list()
    manager.sort_by_material()
    print("Sorted by material:")
    manager.print_list()
    manager.sort_by_type()
    print("Sorted by type:")
    manager.print_list()

    pass

class Box
{
    double width;
    double height;
    double depth;

    Box(Box ob)
    {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }

    Box()
    {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len)
    {
        width = height = depth = len;
    }

    double volume()
    {
        return width * height * depth;
    }
}

class BoxWeight extends Box
{
    double weight;
    BoxWeight(double w, double h, double d, double m)
    {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}
class DemoBoxWeight {
 public static void main(String args[]) {
 BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
 BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
 double vol;
 vol = mybox1.volume();
 System.out.println("Volume of mybox1 is " + vol);
 System.out.println("Weight of mybox1 is " + mybox1.weight);
 System.out.println();
 vol = mybox2.volume();
 System.out.println("Volume of mybox2 is " + vol);
 System.out.println("Weight of mybox2 is " + mybox2.weight);
 }
}
    
    class RefDemo 
    {
        public static void main(String args[])
        {
            BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
            Box plainbox = new Box();
            double vol;
            vol = weightbox.volume();
            System.out.println("Volume of weightbox is " + vol);
            System.out.println("Weight of weightbox is " + weightbox.weight);
            System.out.println();
            plainbox = weightbox;
            vol = plainbox.volume();
            System.out.println("Volume of plainbox is " + vol);
        }
    }

/* 

Volume of weightbox is 105.0
Weight of weightbox is 8.37

Volume of plainbox is 105.0

*/
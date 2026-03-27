package AbstractClass;

abstract class AbstractBlocks {
    {
        System.out.println("abstact class instance block");
    }
    static {
        System.out.println("abstract class static block");
    }
    AbstractBlocks (){
        System.out.println("Abstract class Constructor");
    }
}
class BlockDemo extends AbstractBlocks{
    BlockDemo(){
        System.out.println("normal class constructor");
    }

    public static void main(String[] args) {
        new BlockDemo();
    }
}

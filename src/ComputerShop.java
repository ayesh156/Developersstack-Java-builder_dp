public class ComputerShop {
    public static void main(String[] args) {
        Computer kamal = new ComputerBuilder()
                .setBrand("Lenovo")
                .setDiskSpace(256L).getComputer();
        
        Computer saman = new ComputerBuilder().setRam(32)
                .getComputer();
        System.out.println(kamal);
        System.out.println(saman);
    }
}

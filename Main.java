class Main {
    public static void main(String[] args) {
        
        Mhs mhs = new(username:"ini_username", password:"ini_password");

        mhs.setNama(nama:"Ellen Putri N");
        mhs.setNim(nim:"G.111.19.0014");
        mhs.setSmt(smt:8);

        System.out.println("Nama Mhs:" + mhs.getNama());
        System.out.println("Nama Mhs:" + mhs.getNim());
        System.out.println("Nama Mhs:" + mhs.getSmt());
        System.out.println("Nama Mhs:" + mhs.getUsername());
        System.out.println("Nama Mhs:" + mhs.getPassword());

    }
}
public  abstract class Peminjam implements UserLogin{
    private boolean isLogin;
    private boolean isAntiDenda;

    @Override
    public void doLogin(){
        System.out.println("Peminjam Berhasil Login");
        isLogin = true;
    }

    @Override
    public void doLogout(){
        System.out.println("Peminjam berhasil logout");
        isLogin = false;
    }

    @Override
    public boolean isLogin(){
        return isLogin;
    }

    public abstract void setKodePeminjam(String kodePeminjam);
    public abstract String getKodePeminjam();
    public abstract void setNamaPeminjam(String namaPeminjam);
    public abstract String getNamaPeminjam();

    public void addAntiDenda (){

    }
        
    public void removeAntiDenda(){
        
    }

    public boolean getAntiDenda(){
        return isAntiDenda;
    }


}
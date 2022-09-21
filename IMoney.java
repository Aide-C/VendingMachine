public interface IMoney {
    public ICoin[] Exit();
    public void Insert(ICoin c);
    public int GetBalance();
}

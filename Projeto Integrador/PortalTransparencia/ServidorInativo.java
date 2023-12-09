namespace PortalTransparencia{
    public class ServidorInativo : Servidor
    {
        public ServidorInativo()
        {

        }
        public ServidorInativo(string vinculo, double totalLiquido)
        {
            Vinculo = vinculo;
            TotalLiquido = totalLiquido;
        }

        public string vinculo;
        public double TotalLiquido;
    }
}
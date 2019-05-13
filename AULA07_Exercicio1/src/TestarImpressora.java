public class TestarImpressora {
    public static void main(String[] args) {

        Foto foto = new Foto();
        foto.setNome("Foto1");
        foto.setTipo("JPG");

        Contrato contrato = new Contrato();
        contrato.setNome("Contrato da Casa");
        contrato.setTipo("PDF");

        Documento documento = new Documento();
        documento.setNome("Documento Recibos");
        documento.setTipo("docx");

        Impressora impressora = new Impressora();
        impressora.adicionalImprimivel(foto);
        impressora.adicionalImprimivel(contrato);
        impressora.adicionalImprimivel(documento);

        impressora.imprimirTudo();

    }
}

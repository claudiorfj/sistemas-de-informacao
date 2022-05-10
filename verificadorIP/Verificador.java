package verificadorIP;

public class Verificador {
	
	private String 		BinarioValue,
						MascaraPadrao,
						BinarioFormatado;
	
	public void Conversor(String[] IP) {
		
		for (int x = 0; x < IP.length; x++)
		{
			System.out.println("(" + IP[x] + ")");
			
			System.out.println("IP Inserido (Decimal): " + String.format("|%,d|", (Integer.parseInt(IP[x]))));
			
			BinarioValue = Integer.toBinaryString(Integer.parseInt(IP[x]));
		
			BinarioFormatado = String.format("%08d", Integer.parseInt(BinarioValue));
			
			System.out.println("IP Inserido (Binario): " + BinarioFormatado + "\n");
		
			if (x == 0) MascaraPadrao = BinarioFormatado.substring(0, 2);
		}
		
		System.out.println("Dois primeiros bits: "+MascaraPadrao);
		
		if (MascaraPadrao.equals("00") || MascaraPadrao.equals("01"))
		{
			System.out.println("IP classe A, com mascara padrao /8.");
		}
		
		if (MascaraPadrao.equals("10"))
		{
			System.out.println("IP classe B, com mascara padrao /16.");
		}
		
		if (MascaraPadrao.equals("11"))
		{
			System.out.println("IP classe C, com mascara padrao /24.");
		}
	}
}
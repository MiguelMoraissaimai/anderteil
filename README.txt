do{
	dia++;

	double probabilidadLluvia = Math.random();
	int aporteAgua = probabilidadLluvia <= 0.05 ? 5:
					probabilidadLluvia <= 0.1 ? 2 : 0;
	profundidadAgua = profundidadAgua + aporteAgua;

	caracolSube = (int)(Math.random()*(4-1+1)+1);
	caracolBaja = (int)(Math.random()*(2-0+1)+0);
	profundidadCaracol = profundidadCaracol-caracolSube+caracolBaja;
	



} while(profundidadCaracol>0);

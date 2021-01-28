/*primer seccion: codigo de usuario*/


%%

/*segunda seccion: configuracion*/
%class ejercicioLab
%standalone
%unicode
%line
%column

%{
    public int binariosEncontrados = 1;
%}

%%


/*tercer seccion: reglase lexicas*/

(0|1 (0|1)*)	{ System.out.println("encontrado un binario!!, total encontrados: "+binariosEncontrados++); }


[^] {}

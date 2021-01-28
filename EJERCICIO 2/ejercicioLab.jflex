/*primer seccion: codigo de usuario*/


%%

/*segunda seccion: configuracion*/
%class ejercicioLab
%standalone
%unicode
%line
%column
Whitespace = [\t\n]+
Letter = [a-zA-Z]
Letters = [a-zA-Z]+
%{
    public int binariosEncontrados = 1;
    public int palabrasEncontradas = 1;
%}

%%


/*tercer seccion: reglase lexicas*/

(0|1 (0|1)*)	{ System.out.println("encontrado un binario!!, total encontrados: "+binariosEncontrados++); }

{Whitespace}  {System.out.println("Eh encontrado un separador de texto: "+this.yyline+" "+this.yycolumn);}

{Letters} {System.out.println("Eh encontrado una cadena de texto: "+this.yytext()+", numero de palabra: "+palabrasEncontradas++);}

[^] {/* Do nothing*/}

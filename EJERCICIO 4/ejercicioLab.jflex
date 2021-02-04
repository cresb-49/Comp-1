/*primer seccion: codigo de usuario*/


%%

/*segunda seccion: configuracion*/
%class ejercicioLab
%standalone
%unicode
%line
%column

/*eXPRECIONES REGULARES*/
LineTerminator = [\r|\n|\r\n]+
Whitespace = [ \t\n]+
LENGUAJE_3 = (b*ab*a?b*a?b*)

//Seccion de codigo incrustado
%{
    public int cont = 1;
%}

%%

/* REGLAS LEXICAS */
<YYINITIAL>{
    {LENGUAJE_3}
        {
            System.out.println("Cadena "+cont+" aceptada: "+yytext()+ " Linea: "+(yyline+1)+" Columna: "+(yycolumn+1)); 
            cont++;
        }
    {Whitespace}  
        {
            /*IGNORE*/
            //System.out.println("Se encontro separador de texto");
        }
    
}
[^] {System.out.println("Se encontro un error: "+yytext());}

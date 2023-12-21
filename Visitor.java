import org.antlr.runtime.tree.CommonTree;

import java.util.List;

public interface Visitor{
   public List<Secteur> visitorAST(CommonTree ast);
   public Fonction visitorFonction(CommonTree ast);
   public Bloc visitorBloc(CommonTree ast);
   public Symbole visitorSymbole(CommonTree ast);
}


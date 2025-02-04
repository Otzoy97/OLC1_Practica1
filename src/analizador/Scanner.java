/* The following code was generated by JFlex 1.7.0 */

                                                                                                                                                                                                                                                                                                                                                                                                                package analizador;
import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>scanner.flex</tt>
 */
public class Scanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\11\1\6\1\60\1\12\1\2\22\0\1\13\1\0\1\5"+
    "\5\0\1\16\1\17\1\3\1\14\1\23\1\15\1\0\1\1\12\4"+
    "\1\22\1\21\1\0\1\20\1\0\1\25\1\0\1\50\1\47\1\51"+
    "\1\42\1\43\1\44\1\41\1\7\1\37\1\55\1\7\1\45\1\57"+
    "\1\40\1\46\1\56\1\7\1\35\1\33\1\34\1\54\2\7\1\52"+
    "\1\53\1\7\1\26\1\0\1\27\1\0\1\10\1\0\1\50\1\47"+
    "\1\51\1\42\1\43\1\44\1\41\1\7\1\37\1\55\1\7\1\45"+
    "\1\57\1\40\1\46\1\56\1\7\1\35\1\33\1\34\1\54\2\7"+
    "\1\52\1\53\1\7\1\30\1\0\1\31\7\0\1\60\71\0\1\24"+
    "\160\0\2\36\115\0\1\32\u1ea8\0\1\60\1\60\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\1\1\6"+
    "\1\1\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\1"+
    "\2\6\1\1\7\6\3\0\1\25\1\0\1\6\1\0"+
    "\1\6\1\0\1\26\1\6\1\26\7\6\1\3\3\0"+
    "\1\6\1\0\1\6\2\27\10\6\3\0\1\6\1\0"+
    "\2\6\1\0\3\6\1\0\1\6\1\30\1\31\2\6"+
    "\1\0\1\6\1\0\2\6\1\0\1\6\1\0\2\6"+
    "\1\0\1\6\1\32\1\6\2\33\2\34\1\35\2\36"+
    "\1\0\1\6\1\0\1\6\1\0\1\6\2\37\1\40"+
    "\1\41\1\40\1\41\1\0\1\6\2\42\1\0\1\6"+
    "\1\0\1\6\2\0\2\6\2\0\2\6\2\43\2\0"+
    "\2\6\2\0\2\6\2\0\2\6\2\0\2\6\2\0"+
    "\2\6\2\0\2\6\2\0\2\6\2\0\2\6\1\44"+
    "\1\45\1\44\1\45\1\0\1\46\1\6\1\46\1\0"+
    "\1\6\2\47";

  private static int [] zzUnpackAction() {
    int [] result = new int[182];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\61\0\142\0\61\0\61\0\223\0\304\0\365"+
    "\0\u0126\0\61\0\61\0\61\0\61\0\61\0\61\0\61"+
    "\0\61\0\61\0\61\0\61\0\61\0\61\0\61\0\u0157"+
    "\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u024c\0\u027d\0\u02ae\0\u02df"+
    "\0\u0310\0\u0341\0\u0372\0\u03a3\0\304\0\61\0\u03d4\0\u0405"+
    "\0\u0436\0\u0467\0\u0498\0\61\0\u04c9\0\365\0\u04fa\0\u052b"+
    "\0\u055c\0\u058d\0\u05be\0\u05ef\0\u0620\0\u0372\0\u0651\0\u0682"+
    "\0\u06b3\0\u06e4\0\u0715\0\u0746\0\61\0\365\0\u0777\0\u07a8"+
    "\0\u07d9\0\u080a\0\u083b\0\u086c\0\u089d\0\u08ce\0\u08ff\0\u0930"+
    "\0\u0961\0\u0992\0\u09c3\0\u09f4\0\u0a25\0\u0a56\0\u0a87\0\u0ab8"+
    "\0\u0ae9\0\u0b1a\0\u0b4b\0\365\0\365\0\u0b7c\0\u0bad\0\u0bde"+
    "\0\u0c0f\0\u0c40\0\u0c71\0\u0ca2\0\u0cd3\0\u0d04\0\u0d35\0\u0d66"+
    "\0\u0d97\0\u0dc8\0\u0df9\0\365\0\u0e2a\0\61\0\365\0\u0e5b"+
    "\0\u0e8c\0\365\0\61\0\365\0\u0ebd\0\u0eee\0\u0f1f\0\u0f50"+
    "\0\u0f81\0\u0fb2\0\u0fe3\0\u1014\0\61\0\61\0\365\0\365"+
    "\0\u1045\0\u1076\0\61\0\365\0\u10a7\0\u10d8\0\u1109\0\u113a"+
    "\0\u116b\0\u119c\0\u11cd\0\u11fe\0\u122f\0\u1260\0\u1291\0\u12c2"+
    "\0\61\0\365\0\u12f3\0\u1324\0\u1355\0\u1386\0\u13b7\0\u13e8"+
    "\0\u1419\0\u144a\0\u147b\0\u14ac\0\u14dd\0\u150e\0\u153f\0\u1570"+
    "\0\u15a1\0\u15d2\0\u1603\0\u1634\0\u1665\0\u1696\0\u16c7\0\u16f8"+
    "\0\u1729\0\u175a\0\u178b\0\u17bc\0\u17ed\0\u181e\0\u184f\0\u1880"+
    "\0\u18b1\0\u18e2\0\61\0\61\0\365\0\365\0\u1913\0\61"+
    "\0\u1944\0\365\0\u1975\0\u19a6\0\61\0\365";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[182];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\4\1\10"+
    "\1\2\1\11\1\0\1\4\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\10\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\5\10\1\41\4\10\1\42"+
    "\1\10\63\0\1\43\1\0\1\44\61\0\1\6\54\0"+
    "\5\45\2\46\52\45\4\0\1\10\2\0\2\10\22\0"+
    "\3\10\1\0\21\10\13\0\1\4\102\0\1\47\30\0"+
    "\1\10\2\0\2\10\22\0\1\10\1\50\1\10\1\0"+
    "\21\10\5\0\1\10\2\0\2\10\22\0\3\10\1\51"+
    "\1\52\20\10\41\0\1\53\1\0\1\54\22\0\1\10"+
    "\2\0\2\10\22\0\3\10\1\0\1\10\1\55\1\10"+
    "\1\56\15\10\5\0\1\10\2\0\2\10\22\0\3\10"+
    "\1\0\7\10\1\57\11\10\5\0\1\10\2\0\2\10"+
    "\22\0\2\10\1\60\1\0\11\10\1\61\7\10\5\0"+
    "\1\10\2\0\2\10\22\0\3\10\1\0\4\10\1\62"+
    "\14\10\5\0\1\10\2\0\2\10\22\0\3\10\1\0"+
    "\16\10\1\63\2\10\5\0\1\10\2\0\2\10\22\0"+
    "\3\10\1\0\7\10\1\64\11\10\5\0\1\10\2\0"+
    "\2\10\22\0\3\10\1\0\15\10\1\65\3\10\1\0"+
    "\2\66\1\0\3\66\1\0\52\66\1\67\1\70\57\67"+
    "\35\0\1\71\27\0\1\10\2\0\2\10\22\0\2\10"+
    "\1\72\1\0\21\10\35\0\1\73\30\0\1\10\2\0"+
    "\2\10\22\0\1\10\1\74\1\10\1\0\21\10\35\0"+
    "\1\75\30\0\1\10\2\0\2\10\22\0\1\10\1\76"+
    "\1\10\1\0\21\10\5\0\1\10\2\0\2\10\22\0"+
    "\3\10\1\0\20\10\1\77\5\0\1\10\2\0\2\10"+
    "\22\0\3\10\1\0\7\10\1\100\1\10\1\101\7\10"+
    "\5\0\1\10\2\0\2\10\22\0\3\10\1\0\6\10"+
    "\1\102\12\10\5\0\1\10\2\0\2\10\22\0\3\10"+
    "\1\0\5\10\1\103\13\10\5\0\1\10\2\0\2\10"+
    "\22\0\3\10\1\0\4\10\1\104\14\10\5\0\1\10"+
    "\2\0\2\10\22\0\3\10\1\0\6\10\1\105\12\10"+
    "\5\0\1\10\2\0\2\10\22\0\3\10\1\0\1\10"+
    "\1\106\17\10\1\0\3\67\1\107\55\67\1\0\1\70"+
    "\1\0\1\110\113\0\2\111\25\0\1\10\2\0\2\10"+
    "\22\0\3\10\1\111\1\112\20\10\55\0\1\113\10\0"+
    "\1\10\2\0\2\10\22\0\3\10\1\0\15\10\1\114"+
    "\3\10\5\0\1\10\2\0\2\10\22\0\3\10\1\0"+
    "\10\10\1\115\10\10\5\0\1\10\2\0\2\10\21\0"+
    "\1\116\1\117\2\10\1\0\21\10\5\0\1\10\2\0"+
    "\2\10\22\0\3\10\1\0\5\10\1\120\13\10\5\0"+
    "\1\10\2\0\2\10\22\0\3\10\1\0\4\10\1\121"+
    "\14\10\5\0\1\10\2\0\2\10\22\0\3\10\1\122"+
    "\1\123\20\10\5\0\1\10\2\0\2\10\22\0\3\10"+
    "\1\0\13\10\1\124\1\125\4\10\5\0\1\10\2\0"+
    "\2\10\22\0\3\10\1\0\7\10\1\126\11\10\5\0"+
    "\1\10\2\0\2\10\22\0\1\10\1\127\1\10\1\0"+
    "\21\10\1\0\1\67\1\4\1\67\1\107\55\67\1\0"+
    "\1\4\117\0\1\130\24\0\1\10\2\0\2\10\22\0"+
    "\3\10\1\0\1\10\1\131\17\10\46\0\1\132\17\0"+
    "\1\10\2\0\2\10\22\0\3\10\1\0\6\10\1\133"+
    "\12\10\5\0\1\10\2\0\2\10\22\0\2\10\1\134"+
    "\1\0\21\10\47\0\1\135\16\0\1\10\2\0\2\10"+
    "\22\0\3\10\1\0\7\10\1\136\11\10\5\0\1\10"+
    "\2\0\2\10\22\0\3\10\1\137\1\140\20\10\5\0"+
    "\1\10\2\0\2\10\22\0\2\10\1\141\1\0\21\10"+
    "\41\0\1\142\24\0\1\10\2\0\2\10\22\0\3\10"+
    "\1\0\1\10\1\143\17\10\5\0\1\10\2\0\2\10"+
    "\22\0\2\10\1\144\1\0\21\10\5\0\1\10\2\0"+
    "\2\10\22\0\3\10\1\0\7\10\1\145\11\10\42\0"+
    "\1\146\23\0\1\10\2\0\2\10\22\0\3\10\1\0"+
    "\2\10\1\147\16\10\47\0\1\150\16\0\1\10\2\0"+
    "\2\10\22\0\3\10\1\0\7\10\1\151\11\10\5\0"+
    "\1\10\2\0\2\10\22\0\3\10\1\0\4\10\1\152"+
    "\14\10\36\0\1\153\27\0\1\10\2\0\2\10\22\0"+
    "\2\10\1\154\1\0\21\10\52\0\1\155\13\0\1\10"+
    "\2\0\2\10\22\0\3\10\1\0\12\10\1\156\6\10"+
    "\5\0\1\10\2\0\2\10\22\0\3\10\1\157\1\160"+
    "\20\10\37\0\2\161\25\0\1\10\2\0\2\10\22\0"+
    "\3\10\1\161\1\162\20\10\5\0\1\10\2\0\2\10"+
    "\21\0\1\163\1\164\2\10\1\0\21\10\53\0\1\165"+
    "\1\166\11\0\1\10\2\0\2\10\22\0\3\10\1\0"+
    "\13\10\1\167\1\170\4\10\51\0\1\171\14\0\1\10"+
    "\2\0\2\10\22\0\3\10\1\0\11\10\1\172\7\10"+
    "\51\0\1\173\14\0\1\10\2\0\2\10\22\0\3\10"+
    "\1\0\11\10\1\174\7\10\36\0\1\175\27\0\1\10"+
    "\2\0\2\10\22\0\2\10\1\176\1\0\21\10\53\0"+
    "\1\177\12\0\1\10\2\0\2\10\22\0\3\10\1\0"+
    "\13\10\1\200\5\10\46\0\1\201\1\0\1\202\15\0"+
    "\1\10\2\0\2\10\22\0\3\10\1\0\6\10\1\203"+
    "\1\10\1\204\10\10\42\0\1\205\10\0\1\206\12\0"+
    "\1\10\2\0\2\10\22\0\3\10\1\0\2\10\1\207"+
    "\10\10\1\210\5\10\54\0\1\211\11\0\1\10\2\0"+
    "\2\10\22\0\3\10\1\0\14\10\1\212\4\10\37\0"+
    "\2\213\71\0\1\214\14\0\1\10\2\0\2\10\22\0"+
    "\3\10\1\213\1\215\20\10\5\0\1\10\2\0\2\10"+
    "\22\0\3\10\1\0\11\10\1\216\7\10\46\0\1\217"+
    "\66\0\1\220\11\0\1\10\2\0\2\10\22\0\3\10"+
    "\1\0\6\10\1\221\12\10\5\0\1\10\2\0\2\10"+
    "\22\0\3\10\1\0\14\10\1\222\4\10\41\0\1\223"+
    "\55\0\1\224\27\0\1\10\2\0\2\10\22\0\3\10"+
    "\1\0\1\10\1\225\17\10\5\0\1\10\2\0\2\10"+
    "\22\0\2\10\1\226\1\0\21\10\47\0\1\227\57\0"+
    "\1\230\17\0\1\10\2\0\2\10\22\0\3\10\1\0"+
    "\7\10\1\231\11\10\5\0\1\10\2\0\2\10\22\0"+
    "\3\10\1\0\6\10\1\232\12\10\44\0\1\233\52\0"+
    "\1\234\27\0\1\10\2\0\2\10\22\0\3\10\1\0"+
    "\4\10\1\235\14\10\5\0\1\10\2\0\2\10\22\0"+
    "\2\10\1\236\1\0\21\10\50\0\1\237\47\0\2\240"+
    "\25\0\1\10\2\0\2\10\22\0\3\10\1\0\10\10"+
    "\1\241\10\10\5\0\1\10\2\0\2\10\22\0\3\10"+
    "\1\240\1\242\20\10\51\0\1\243\60\0\1\244\14\0"+
    "\1\10\2\0\2\10\22\0\3\10\1\0\11\10\1\245"+
    "\7\10\5\0\1\10\2\0\2\10\22\0\3\10\1\0"+
    "\11\10\1\246\7\10\51\0\1\247\50\0\1\250\24\0"+
    "\1\10\2\0\2\10\22\0\3\10\1\0\11\10\1\251"+
    "\7\10\5\0\1\10\2\0\2\10\22\0\3\10\1\0"+
    "\1\10\1\252\17\10\33\0\2\253\57\0\2\254\31\0"+
    "\1\10\2\0\2\10\21\0\1\253\1\255\2\10\1\0"+
    "\21\10\5\0\1\10\2\0\2\10\21\0\1\254\1\256"+
    "\2\10\1\0\21\10\46\0\1\257\56\0\1\260\21\0"+
    "\1\10\2\0\2\10\22\0\3\10\1\0\6\10\1\261"+
    "\12\10\5\0\1\10\2\0\2\10\22\0\3\10\1\0"+
    "\4\10\1\262\14\10\44\0\1\263\21\0\1\10\2\0"+
    "\2\10\22\0\3\10\1\0\4\10\1\264\14\10\33\0"+
    "\2\265\31\0\1\10\2\0\2\10\21\0\1\265\1\266"+
    "\2\10\1\0\21\10\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6615];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\2\11\4\1\16\11\13\1\3\0"+
    "\1\11\1\0\1\1\1\0\1\1\1\0\1\11\12\1"+
    "\3\0\1\1\1\0\1\1\1\11\11\1\3\0\1\1"+
    "\1\0\2\1\1\0\3\1\1\0\5\1\1\0\1\1"+
    "\1\0\2\1\1\0\1\1\1\0\2\1\1\0\3\1"+
    "\1\11\4\1\1\11\1\1\1\0\1\1\1\0\1\1"+
    "\1\0\3\1\2\11\2\1\1\0\1\1\1\11\1\1"+
    "\1\0\1\1\1\0\1\1\2\0\2\1\2\0\2\1"+
    "\1\11\1\1\2\0\2\1\2\0\2\1\2\0\2\1"+
    "\2\0\2\1\2\0\2\1\2\0\2\1\2\0\2\1"+
    "\2\0\2\1\2\11\2\1\1\0\1\11\2\1\1\0"+
    "\1\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[182];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    public static String Err ="<h4>Errores léxicos</h4>";


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 228) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { Err += "Lexema " + yytext() + ", Línea " + yyline + ", Columna " + yychar + "<br/>";
    System.out.println(Err);
            } 
            // fall through
          case 40: break;
          case 2: 
            { return new Symbol(sym.DIVISION, yycolumn,yyline,yytext());
            } 
            // fall through
          case 41: break;
          case 3: 
            { 
            } 
            // fall through
          case 42: break;
          case 4: 
            { return new Symbol(sym.PRODUCTO, yycolumn,yyline,yytext());
            } 
            // fall through
          case 43: break;
          case 5: 
            { return new Symbol(sym.ENTERO, yycolumn, yyline, yytext());
            } 
            // fall through
          case 44: break;
          case 6: 
            { return new Symbol(sym.IDENTIFICADOR, yycolumn,yyline,yytext());
            } 
            // fall through
          case 45: break;
          case 7: 
            { return new Symbol(sym.MAS, yycolumn,yyline,yytext());
            } 
            // fall through
          case 46: break;
          case 8: 
            { return new Symbol(sym.MENOS, yycolumn,yyline,yytext());
            } 
            // fall through
          case 47: break;
          case 9: 
            { return new Symbol(sym.ABRIR_PARENTESIS, yycolumn,yyline,yytext());
            } 
            // fall through
          case 48: break;
          case 10: 
            { return new Symbol(sym.CERRAR_PARENTESIS, yycolumn,yyline,yytext());
            } 
            // fall through
          case 49: break;
          case 11: 
            { return new Symbol(sym.IGUAL, yycolumn,yyline,yytext());
            } 
            // fall through
          case 50: break;
          case 12: 
            { return new Symbol(sym.SEMICOLON, yycolumn, yyline,yytext());
            } 
            // fall through
          case 51: break;
          case 13: 
            { return new Symbol(sym.COLON, yycolumn, yyline,yytext());
            } 
            // fall through
          case 52: break;
          case 14: 
            { return new Symbol(sym.COMA, yycolumn, yyline,yytext());
            } 
            // fall through
          case 53: break;
          case 15: 
            { return new Symbol(sym.ABRIR_INTERROGACION,yycolumn,yyline,yytext());
            } 
            // fall through
          case 54: break;
          case 16: 
            { return new Symbol(sym.CERRAR_INTERROGACION,yycolumn,yyline,yytext());
            } 
            // fall through
          case 55: break;
          case 17: 
            { return new Symbol(sym.ABRIR_CORCHETE,yycolumn,yyline,yytext());
            } 
            // fall through
          case 56: break;
          case 18: 
            { return new Symbol(sym.CERRAR_CORCHETE,yycolumn,yyline,yytext());
            } 
            // fall through
          case 57: break;
          case 19: 
            { return new Symbol(sym.ABRIR_LLAVE, yycolumn, yyline,yytext());
            } 
            // fall through
          case 58: break;
          case 20: 
            { return new Symbol(sym.CERRAR_LLAVE, yycolumn,yyline,yytext());
            } 
            // fall through
          case 59: break;
          case 21: 
            { return new Symbol(sym.CADENA, yycolumn,yyline,yytext());
            } 
            // fall through
          case 60: break;
          case 22: 
            { return new Symbol(sym.ID,yycolumn,yyline,yytext());
            } 
            // fall through
          case 61: break;
          case 23: 
            { return new Symbol(sym.INT,yycolumn,yyline,yytext());
            } 
            // fall through
          case 62: break;
          case 24: 
            { return new Symbol(sym.EJEX,yycolumn,yyline,yytext());
            } 
            // fall through
          case 63: break;
          case 25: 
            { return new Symbol(sym.EJEY,yycolumn,yyline,yytext());
            } 
            // fall through
          case 64: break;
          case 26: 
            { return new Symbol(sym.COLOR,yycolumn,yyline,yytext());
            } 
            // fall through
          case 65: break;
          case 27: 
            { return new Symbol(sym.STRING,yycolumn,yyline,yytext());
            } 
            // fall through
          case 66: break;
          case 28: 
            { return new Symbol(sym.TITULO,yycolumn,yyline,yytext());
            } 
            // fall through
          case 67: break;
          case 29: 
            { return new Symbol(sym.NOMBRE,yycolumn,yyline,yytext());
            } 
            // fall through
          case 68: break;
          case 30: 
            { return new Symbol(sym.GROSOR,yycolumn,yyline,yytext());
            } 
            // fall through
          case 69: break;
          case 31: 
            { return new Symbol(sym.PUNTOS,yycolumn,yyline,yytext());
            } 
            // fall through
          case 70: break;
          case 32: 
            { return new Symbol(sym.TITULOX,yycolumn,yyline,yytext());
            } 
            // fall through
          case 71: break;
          case 33: 
            { return new Symbol(sym.TITULOY,yycolumn,yyline,yytext());
            } 
            // fall through
          case 72: break;
          case 34: 
            { return new Symbol(sym.GALERIA,yycolumn,yyline,yytext());
            } 
            // fall through
          case 73: break;
          case 35: 
            { return new Symbol(sym.PUNTOSXY,yycolumn,yyline,yytext());
            } 
            // fall through
          case 74: break;
          case 36: 
            { return new Symbol(sym.GRAFICALINEAS,yycolumn,yyline,yytext());
            } 
            // fall through
          case 75: break;
          case 37: 
            { return new Symbol(sym.GRAFICABARRAS,yycolumn,yyline,yytext());
            } 
            // fall through
          case 76: break;
          case 38: 
            { return new Symbol(sym.DEFINIRXYLINE,yycolumn,yyline,yytext());
            } 
            // fall through
          case 77: break;
          case 39: 
            { return new Symbol(sym.DEFINIR,yycolumn,yyline,yytext());
            } 
            // fall through
          case 78: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}

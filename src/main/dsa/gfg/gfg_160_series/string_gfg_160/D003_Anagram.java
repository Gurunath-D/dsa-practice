package src.main.dsa.gfg.gfg_160_series.string_gfg_160;

import java.util.HashMap;
import java.util.Map;

public class D003_Anagram {

    public static void main(String[] args) {
        System.out.println(areAnagrams("geeks", "kseeg"));
        System.out.println(areAnagramsV2("geeks", "kseeg"));
        System.out.println(areAnagrams("allergy", "allergic"));
        System.out.println(areAnagramsV2("allergy", "allergic"));
        System.out.println(areAnagrams("g", "g"));
        System.out.println(areAnagramsV2("g", "g"));
        System.out.println(areAnagrams("axwjrsmcyfljybqjinfuedwfsyxybxeadutkeqqcsomyicvrnrwqjcwbizgmtbmgqzmhwmqyhrfumzretaevwiuztmcastfhgmnnjxvirvenudnbnsevdgplfazjobqutkgxgfoqsirfutibkjrgxlsnmxaugzwvuisijozitqohmgokcqmcdpwttnocyzomgqtgptcalwimrsgfdjutpcqiapuhxlpxyakptegqekrvprgrdkpowunrsnxnqicaprixpdplxeccktmggcuqozmtfnmwxydtlfqapvmamkjcepnpbvvqxqmqwsuswltdladobmospnovjuatytbqloyyxqpxnhfbsnstdbgjqicvrejsslsktjywbxwfilaowigljbhbfdwyfthqlyfbfzhrawlsyyumyjdidjgtlecffzyegkfqqmeonieqrzhqmtghifjckriuizfdjzhpujetyfyckjvomxtzwpnsdrrfxkaoeqwdkxywwnahvnmbdxurhtasvqlrsiygqvghucdxhicadmvaphuzborryclhtvspziqxiuoituudmbsprrsxshwuaampudblktdmgdzxmdrwtxatfleuqlkflwdwrycferavwkfwindkasmoyichhuwojrpxvhjcravubtunlzlqsybtyrzlszmsvepyhrjmueaorgtwhctvxmotfsnefcnocicxfkliywnioekyzdxlaisglhxqlvbtixyjoewjwjuqdwkavyiehemlglyvlvvlijmxqkanvzqiguynhwjymxsrhizlrshbuwjmbalprujrzumbhrypbljurcpovoqrwgszdynexxkgqdntvxjdstlmcafqanldefgkshukfidqgprfdddfybcszgwrjohpuvgrjfxxtrqrdyizndqcovzeeekdcixmhfvdwqmwulpcxubjthblusjsbtyvgrraristsfwyfmckfkamuphojcummguextqptomvaldidckpvxjaigzmbmubjfwhlgiwwjzcmmvzpiaqrnynplsmoeufwknqwnigsomnwarlvkzvfeyinqiqyuuxgfebmtorpfqmcbsctlfnporiqvcydlnglopbfxzivieagcmvopvqfmwfeqqvvrwfaiotzoiugkvmflzjawohnwngfotqhuqgaassiprffbuywiiozvxbeildivltzwmblsxknndqbzwvnypxnktsehvvktfhwqhmhcwboxgeuxtehdhhsbcxdgejtjyhdbmdxbgxjwhnttytiuzcyddtbfdbwoonevkgunwcgwofukgqutgjvsqxumzinoyudazwqwdyjvahnsqitatccyilowdnybwvkmgwgvyzqkmycjrohyvsxsldfxjjdmzctmvxekolntzhlscntdzgytacxhuehdfudtshevzqfqkcojgxlizcrnubtshuqwxiolfacnulacrxkuzqadabiwgudztgpncwycqbgzdxedryvukwlsrmjbnmutnzddppokonmfmfnwkgsktjowxvgypelbobwbnzqkbzsdqbppqdagpjzrlfjnzsagrrzxvykizoihecegkbjykkubyleempfziwvvaqysswxvkgkqxhtojqxhhpiurixuqmlroqbzljbkgprxqhtgjhjfqwdhcjzvvqksqcxohczbnvrjocmpwyffmaprfhrehfcrnqmbpmispxvzzvqyjepqdyytypmufxskwdxkynlvrfbznmglcemeytkkldwrcseliwkbcunvflqnjywgcowozjgqnvxgijqeajbuzyiepsfypoubjhbchxvvcojsbvihbzsngdzajjrpsvovqfpabpvchnycwpqjjhrsxltqpulczdcdakklninvwbiazwchbfvjrlcmildhzsevkcbvorbgvzeqbwqneupmjeximleylrqrhyylmelwnhkgcnclzhfxcxwlkohltnprtoyjiclfvxpmyktayaulvjvuueyiybtkhyepwaxpxmamyupwnzsnuulnfduhovlubnqcfwxjxplatfvlmxbvqysctofsfzepnwcmooptggmkvkwwjtnptezxkydlavkokjedumaoeulsmoknnykaofoohtxautxyrlgeoveqmwoblrlpedigpbaownrmdlmlftxpwhafncmicssklsqhznhuucagvskdjrqituzieoxewsiijtcujgvqpzmyjxnvvzdmalddqhejyxtelrrrbkwuqsgkodanhkvymdgmpzhtvckoefwkaselndalkuhfjjoaryjswqvfwdxcnltsahgxwfyfcbelsrukpebfhaafrpixbeejwnrwzlsgsgzykjhgwyuvnoclhhfvovlmcrrbmbsgisefrxtumyjtmgyemvgezekdfkdmorpykirwxtpzgwukphgrbkxpeciggydjogyfamevbcbyicnonsfcgofpqpnaujvdekljndgirbexflelliqggyechahjyyxhlzhcdpdtocfclqlyenlictjcbawxmunwvrionzadqusocbgfanjtbanhofejfmxjgdcgswwdugxttwgaecdpqnkpxkjircebmibpuazzbsyhppfzaaitpskmempbdjmlfwzhruzvcjrbqfcjqnvfbcnmdhsnhqwukwzodpvskkvocqaktkgrzmbymtkxchvnnfjiutyrstvzwydmoguyyrbvgcecbdpwfrwhhvsrzhlegknihmpizlzaqfyjyeihbxvoakuwbpqnfboxcsddttnjlatvgpvgnzusiakazxkwmnidudwclaayibqifadkryltrrgxzvbjmoeuzhmnmeecxjlcecckznobjqulzivksnhrcdtgtrjkccmndcrmpulddgiygjqzjelcxezkgerdcjgiviyseemhccgmvfjokltrkkmlwuvihzyujllghtpvmmuwcukndwnxisogaopuosknokozkadojlitdeidfknqmamftgxukvjxrgdwcieswqrlnrwvtqzwsjkaooenerhmppuehfconjtukxkwwcxgwiggyseodxolbnhwtuxovbkplgsetuosrfkvwijzlnewtjolmopubicypusmhsubbjucgatujpdlkoquoisxwrpdhluqdactttlhtesznwtlnazuoogxzjjjwznezxtuwjawtgxrszzmhiqqimsolocgfvdvecttpqrwlcfcgbhfzbasdhyblonudanzmdiglmrrhfiyskqfobkaimtbvowsahxwuesjjkanmcbexovjbblwnhqheqnizkkkqcdvqzyhriablxizoetjiphfkealnteixkuikjjbezpvwvplmuxijzejhqzrhnpliqbkypvxirserejbseanyhqvufwyeduzpjlgncekxprnukzsdzcwgwozmppzfsjqtuipogowlsqmuxvlslehqpkkllwsdbjuymvxsfuijnqpkxobkqkpcsrixkxztqcqtrwswlosrhzahnumanmnbfhnnljnfhnwkzvpdyqwzggmqytzxvxmpbcbhyalsfusehzsnqqnjaoqozzsyvfzqnifofmzwxftcqolvzituozuyesdjpvraqbrlclttfwuyftenbwmcnfubjcfjvzhzrldbtdxgahxcaekpcipmlyspdxizzswyiwuzcodyepcdjgbmyvxesmhnrpyozkbpxsputeuxqegpydxbbgolhemanxxnjtejnaydmyvafbzlhphwrdcygeflidwzvlztlkpkbgcdxqhyobetzppkllqdpagnluqfbodypitjfoifruedoktqsvvnzfxjrbkveywxdmuyelxzagbipqdbqfuaiolurbqdlgwnoowrzfbthiydiragspuyatdcdmonyozqwmozglwkfsdyrwuvuxaayhxdhbysuuuwhaatzpmnnvqtpvhtnciidivgoaoxkjiyqksedgduqtwhzvsjkgseezgavbzywbbnsyygjmwewwtjlmdujqdpbuyhuioiqyfcrfzgzcdttsxnijodjbpkvubzwvubfzsvcltgamcbiarxnqwxypelkbudqysfayzxkkikdaugcghgalbbdazmhxxdeilcgdnpfqddaaeeccgmwglfdacqjskaxpgmacgosxlskwewerasivniqhatcdgzlyaymuwnmzgaqtqhcnfzcpmepvlgviqfzcwiwbdnzoisczpwuamefwtfrobvyokhubgfrmobyjmwxjvjgajuaipoedhuguywkneqcdnjeqsmbnepmnamngzemsdvcsfzelofrvqqzlqdtoydohunuqmpoffyoffapaforjufxpepiomgsybjgktvnsysvcicryqopbfbjutvgrhxuvrhyappalowykmbjifajropeeuciihvbenohryjukzubuofzugqyehydfauqtulahiprncwvlwhzaibmizmfwghbaonbjoxqqwthslqpmcdvjwkfennuysnkdjgsuksjdrfmzcjnifallkeuizppctxsfezcrzvpotcuakoadntheanqycjrlmluaabzmsvnbccgfrauqmtymtqsgjmpnvexvozhngtuieikebtksgsfvsbsilraucxvtidooqirvjotpknffsbztyjslbbhssbfpepgddbuxnwjirxtrzwlateuvoesaffmiltzzuctwghxrydlhdfdczyojrvhcngiwpjgwmqiigskdjcmlklhslrgsqitpzfgsckaddzjxgquwnnqolseefnefpjdocceafkewdvqvfayijbwkiyjnhjubqxtfkytfjiyafddrtotzdxesfrkcwceaulkwpywliegfruwmymkxxvzsjwimokvfaclrjfddjutjtvnoxcdcaaqulniwiwefwbggysxfbvstwxfoqhoyecduitswsqswmqisvalmnyudwwpqlmgbxszstqvzwunjyzamlejcpxocrsmudsumbgcjvtgqldwsvhmkyfjcwkskyvmsgmmzzbbhnxrrnqtluwvvmyniskowugvskqhfcavxatcnofxfknldbvrdhjdmddwcqieryyhkfywwvdhsqlpastjvsqcsxaucmzbvlctcwgikzmhxhnicrrnsbcdvedqrdvrfrclvzinlekquqawhcwnuighuctwnjzhebpceeclsygqqoaifbtlhstghoeihmmhtxazmijxzfbehwcolaktcdmdnpfokdxiklutbpdwxjgvzqudtmyjbhyhshqggwblcuuiezpubxyleoowikfnzxdmrooapdhitlvfzfocnstbsghzznewapolqxoaehmjjsgpuurmvmbwkdobkrlzzoaziwfcokuzmpiqhindrrjevcahbcrneimvydouviefqyuokneuptfxnvaphbzijfnlszozegxereugdchfvruutqsgruuenyozlkkgppapmkjzqjtgvebbfbcvhjpyylgotvwewlyobrugnepsokrstpnyslabfwkzrulxpauvnkyrobotgftttrlwucgtqqfcjfklwqbpzzemarbvfzrfzsnfttzvkexcmdsbnzbhbitjvtpehtykjvcalsywrcrmfasapnhjdfecxxlpatclarpeifpyxqqktuvheynstyxvmpcroncpcbbbetrcygrlvsecxulbpcjckzaebuobqycilmdtmkbuzygvfzeqwsmnekcuprfrdjdzmaffqjlrggqmgxnhkhxudnxjpumtvgwthsejacejahypuprfadigfgkbjjvxelpzvckmrdkaybdqfszigwsojjqozgtxbizrvyqcnymzkziofejkvxgtzasurvmftynytrkffxblzrwuntvtvvkdjnjxlkjqeoqvxylcphgcitixiohgrhrmftfzdjkxxcxktrkkxrmdxgotspqlphrlrzjybuixsaocnkwkppqgzklzmmgripuvlrnaqhgavsvqqxololxkikzsgazvmfpzinjhkkzugvfmwomlupzovifgutneqbysemgikyusnyidhflmcybteofdirtqqrpicwrweqhrgijqxyffnczxurukglnprlcjhlcwrotufylvcctrjlmuchdotzwzisiobizahooqihneemheickcjelpbskcqvfkoflabnvjqyeojjmniigtgbbmreoqaieharihnpchpkukhdjrpdrxtqzoezbgyjplxatequmfogqgmvsuuxpxtvokocuzjhnzsqscibyuaegrvtqngvlwulgstboerwfdlynbmauemwcuktrazpfvsizm", "cgslvaouqkanoablrsnttfntqsmpylzunkcejqzhecbttisuinjdbuedkwsnredvwxgugktwbvprcjqywxgoqrtyzcfrviwtvdnvedxrkizyrkigafeabvqmfnckxdzixlwfbwkpjmthumhtqcnpancmorzajvjtjawsbkgfmhjxzygqwqbtvngvhtjvrxvwxxotcpejgprcbctywcgahnydziozlqakglyuvzrneaihwkbimehhzdohelpiqyzqdwgacwcldjugvwwuuuvdzrqmhlraczidoijzsytzdtkptiztqephmqmfkidilpkzxvgbiibzerqhzjfwsgcsqimjdsyslhhdzfffaqzbzscpotcdqlhbregmamfhjhbmanntbpvfsratuvtxkojayxawiuqfevmnffcgkzwrugjonbsthugtavvrgtganyqlbuuzmoysquowjkowlykiaivwduwxfelsgscbsyqxgvptolpifapcojceqlcjeapclscaygdgnqwksnefkvugzrfwsxggoojdulckjuvytcevrsvitfpwpzqpyhtrhtsctrzaxritkyptrjjupwkghbadwvxmjdvwnivljvfocfsgvfovgxbnpbkclfvzibxjsguzduufhqgxvjqffqhccmisoqqjldfiitebleezszekoyhhklixbdnzwxxuvunscxncsnwhwwdufulvrwefijcbybofuirnjncdqoaueoutcdnkrgrcvripllwvpovpblqubfvalrryuvsxifbushnhbzygtwgblkdynzqubbgtalbndcphtltowcmuimmzebfeuzvrtyvxlfnpxorbzvgayxkvknaawhdxcmdmgvkcsawqclyqyeguwxstmvmmwoyebpsomietkffftwiisyuebekcdyknonjtxxdhhhlwmgkpdowccyjwmwsdtgbzhwgzhkzosvdzqibxdaeozguquctrfxirwvmtaudwetlvugcrzgazemnvypcblponpzpiesmsiohwlkgxpemqvsdlrqyudbolhzwgbwicvwxfvaxbjyiyecefxrirtssxdfotxtyxcomksaqxggdemtkwkjivcxtozuozylhqayqtosgjomftvzqapoyoiajttmtyzxexengqfyljqulccprydvxsrdyybigakcneldiupxrgrqvhxsswkzhnaujkfdqpydrbfvosfchaczwwzjsnwmjunniqythojofhmduchsywrhjgnhgwwyzpqccgibnjemmxbtnqzabhezhksapiqnbwlidrainuzqbenuydkxcszldzmotxjmdqrjighophilegldjspcmohrtiiuehqinglprvvjclxdgfewcqxercqhvcthokyhsalusnmoewtkfvsmsmpwpdzziooekgflsuhzjbpdwavmdzjlqbpxwzxqcumevbklzyldlcnefxnbpwdnbajbbojajvwcznhilpxjquoekweygowzqynnifofgmifqemuvrvfcwkntaupvojcyganlsgvoqhiojhpjbcrjflckokqwohicghezkbhbjpalijrtykdljxoxrxvsvmrnmfvldqtuutyextyznbdqimpexvtslkwigukmqfvuaqpsfhxwgnzykvmvkkquebspueyyiqiisrovqsnrlxrdionabgcppechauuhcsmivjkcevvvsavwdnrtoswqibjztchrlexwzludecvmsryuynqiguwjtumpquaysuemlikbeuxpgcggppwvootyqdsxadhgmzokdtusftpjuycbaodsupxinfsqddarwitwanyrelkbeqbudkljlsdhrszwpkzpmtaqopkzhctchqfupivhlywmhgnfrabfajqqmjomhsggptlpncnshigppnfbyjupiclbvgswpggpulxrfzywyxzfztpifvzmketbiwuezbkdbprfnyycnaqsluchkxgbknowariosjsmhfmkbblfumbbnknxmuhqsrvnnluuzqyfnaahopmauysgoqpwuzoypwfithiezturrdfpubxeoclqhzvtjeifspcdjjbbzsbapebxffnqxgemqlnflxyxtwusqefntswjbihyybdklmcjntozyzzholgbxxvaizwozvxtxxisfahmrrhdignyjfzsppylzwiarfcurkxymjiqxnmzeukvlcucmjdtrynalaguksbjtwqtufjycfesbngzhphiaqobieolnbfpxkdlyhimoeibgkleoorcmzquzhdnhjphkdekahrqhzfrovrwexymdzjnausnhdbazwhmjridlytdtdjkouesnvznlifzoacoszmjwukjednijraspfsrfjxjlanxywhhexjeiuznhnlqwpesjumdanpmkpqnrxmqjsypfnnmqrdwwkkrmnezjcbcrxzdcclpbxdrrpubcnwomtwjgxqyyugjpuwzybxjhauopgcdnitacztzfemqfwyelvrmfploglrzthoaeqelcvmsllamobyqmcwwespjqanyerikmeeoetwxjwhfbsyblvnvhtqdwjoylpacfqoredjdudmnbynvbvofvibnkobthdmtgsboaigyqirmosouvazwsdpdobdlnekrpuartpzsquskkywcpnvmecvmsooygunqcfljpsypcnvwhivoiqhsrztbtigmvrvtdcaqjhowajnquqajctmpigqscqlixfkljjwvmijtbegnchfksrihesjrocaixlambjwuiljflrsqckotjribumfphxdomjaifjlyusrfuezsifgtmneevatwoqgvaqajuuxogcrkqfkvcliumvzefizixbgftsczommcgsphviesvsnnxuqohipyfwrxbjiyrtjkfhaqmbmteecqlonozwuhfqtczvbldzijgunzetkquzgqkbctqkdsmvawvvqbdwhbvnimmuhdtyamvkseghdsswvieczrgfhbfpqakupkxjqzorlbukyamzyibkqzncrzznytukpctiaczakeprinhbcjwzdkbdvzfsbsujyfczdoaotpwharisxdgnbccegznlkztptcbmdjjynhqygukwpmggivfmuwnvrzfnemlsfufazyaenkzcuerhnzcotkdwgcrhtiaktauyqgazlytceptpbvjblhculcfvbygejbdcfspfgpgcfvxrtgdpdsvbcfybiieenfvlfdydtdcbtacuwxvkzunqijuymyafylomcanmmxmsvvflifkiailkttxdaelqtmsyifygppfdtxwkdtjcfgxnngsvvbklhtnhpyjhnhplmxiohwibtgfnfanulamoqqezgzskynwhoazqopgimbmstlxnffnyctnszpsoiclnvnegosyqtpapijcpqoegnqzqxyvdoukfkoeqswfzwvqkqfrjtfnvtnqogopatplbvkconcerejoyzpabuhdislcxyiehevaqvmdcwjybwkghhswzxblzletstybveyxdxlsnudwlbwmcaaqhrjzdgrdmkjvweuivmdfqnexmzuyknyoutzzkkzlveqigupbkgiuyciebqdifgdpjlqypwndccctpmmwcyflspljtodktjikczzwpuyzzvflsctdraowqfjkkqbqjtbxmcgnrrtvrozfthwypsivbsgrypeiwgjddiexnfuyodfdlxujkdjsikmolmsdsvergothczdxxqrfznaqisijnddncbwdmjjjrhujllxskgjzhczvrfroajovpflvwwjxxssarsrmamelirdxclxvlyqnquydovuzrultahoospnjnkqtbzoayfoeshgrwrntlmemugqwjokgwdagnhcpycwbwqtbndhcbxgfektmkjvshffjqlqyjlhbalmzrdfigkgxhjxrlqiuxluspanvvordgzoyooboqdicikhlcmxrgfygdiwkhuncxpkdgnkwyvivmkcsxqcgylitcklwadtodkujsmxxdhqnojcoxlzrkxfdkqsftlzokcccjzewlcthneqzkmcxrhuskfsqompeesapufhnwntfasptntzawbdxoenmvntimgprpavzoefurzotucxudxzdrjszhjwmrexluwonvsmbczyrnsxyeknvacwwwacnveakisxmqqmukswimsmkuchdxapoqfqpwzgrwfdtvfiykfbekiuhotncochhemyeviyosglcgqtmfphlqlzpjutuzgfdiclkyrlbxnodpulxenjuekcjejwgnalrlgkqqcnlwagvyecgmrccpoesurzuzwernfwmkdxyzbvedszpgrewolugeoddklopfqcgqvvdbwfkokuyhdnbmgvsikhowhtmvokicwewvuzonsanvvsdlfbnnbwrdzgbkapmvtlbbskmvzpbwyxeirmigqqdeqeqpufbufqmpbrtazwryucktseglzbusueammsrujrrszuklgpfmloyiwnxifrtnvivtscumgyrvephxuktucwwcotzjbslbungquvsrqiyiigarvmcxkcqqtdpsxsutrhcdagtmchewzyojbyruryaidywqghxgsmtyogxheluqvdbmkrvoxlcdavamgjorvrvjmfamxcnzyrzgcpiotjbdvsdejhugprgdkuktgrsbxirjmoyubcnaxoebvnxlhbohgpuhqdysldltivhysywmscrimwhsoavyrcyookcjazkafugqxiratvrcdvxmedajzolrplpnwenfcfwfbkmtdjwslgrrkkzydhlqxjgeangkmwweucktiwbcaedfllupaflazeukbvzlwfmqcrxixbtlibplcuijzjyflhruagyhvizsnembekjkjnkglkdnkxumkmhppoqilumgbysetezbdyfkzihgmwesiyjgoiwfzmmkrohzstxafpfyrdavakozglfplmgymejbqlxkahajuzejyfyoexjvqijfwfazxwmbbxtmgykolmcvreeqziryvqaqpuuovhshebmksfhbxjqjlmzpxbpyflvuuaklbkwtferjwodwcghypzxyctkbyvwlsjtaayyudpycyjseifoqbtriwltlgfbszsdvyzfekucmuxesohxyumlrifnauwpothtxjtcwqigtaufkujrmbjcgzwbldhaurltxprwtkjgwufqpqvvgiasrpyeemencwuozoygzqestelfrjohflqlrnafvyzjayzbygqgzfshpmikjwnnalfhuvvkvoedxgahvfdmfgfrllfgdjpdhkewmlrmoprdicnfcedawhifcnjjnnfizznbbipxdvnaunqjbvbruppnxixteebypzybnuytzlgwggoxjgrjwovmgkxuxxhkukuyhjqvvlfedbuzhcdegalluermfnwfsqkgynmbcjnxulvmpmddngwumqxwpzxvwljqamijjwoshcfwkdomcadfxlguhsuyigrbkoskttxivkcetzkpjylcphbgxniixewdysgkttipxbsbvytbbnexajrwvcjzwjoreaubpstrbmtelhpbqhexubdohddooaxqxqbfsiqlsdtdlqlqkgtveprdannpiciunvrjxkpldliwxgtdzmzulsmlnmlmjpajaczjreeaynbjaoonycpftmkltlvgemmelhfdudbeqaxlhvypchuqvuoenarpfqldpxazpkdczhvhttdylrqyfhygsoigifjhncnxthxbhykpccfukxlnetdptuxwxuqgnlvfgpnewfjajoztioikixrpooxaabygjdlwdszyjawqfxgtjgmmaikmctfleqprcrzixaxzmrpvtvgprcumhxxsughqrmqpfhnxjgujdbskcjbqjowzytqwbfadgmldlrtiyixjfmchkjivpaikovnbxnrlnhfjefvhbefxjzhdmtwmlwewenoatqqmnbzfrwmzbcpsxmdwhhgweoslugudzpvvxsdqdqvpwzqrcdtfczcyakeucpljimozooczkkvzftzetuvwfkrinsobeuhkmufiyiquqzfkriwpzyjkoyacwxcvwbiozlohngaelqhuaeklbtpsklzuicttiwlryltylnkreuccgwtthoyksmerpkyuysjhtxwrqssaazegczirbulobfmomdavcjaocqmpfaonhegseaivuydasqkwtqlugsvqvmropkzbrkhnzpostrrvshetbfuwuuonjncrzndsffmzqwfqnmgnflactxuiqsokjgfivecwerzmmetterqxveoyddhgedgghizvvjwyeusbjfyl"));
        System.out.println(areAnagramsV2("axwjrsmcyfljybqjinfuedwfsyxybxeadutkeqqcsomyicvrnrwqjcwbizgmtbmgqzmhwmqyhrfumzretaevwiuztmcastfhgmnnjxvirvenudnbnsevdgplfazjobqutkgxgfoqsirfutibkjrgxlsnmxaugzwvuisijozitqohmgokcqmcdpwttnocyzomgqtgptcalwimrsgfdjutpcqiapuhxlpxyakptegqekrvprgrdkpowunrsnxnqicaprixpdplxeccktmggcuqozmtfnmwxydtlfqapvmamkjcepnpbvvqxqmqwsuswltdladobmospnovjuatytbqloyyxqpxnhfbsnstdbgjqicvrejsslsktjywbxwfilaowigljbhbfdwyfthqlyfbfzhrawlsyyumyjdidjgtlecffzyegkfqqmeonieqrzhqmtghifjckriuizfdjzhpujetyfyckjvomxtzwpnsdrrfxkaoeqwdkxywwnahvnmbdxurhtasvqlrsiygqvghucdxhicadmvaphuzborryclhtvspziqxiuoituudmbsprrsxshwuaampudblktdmgdzxmdrwtxatfleuqlkflwdwrycferavwkfwindkasmoyichhuwojrpxvhjcravubtunlzlqsybtyrzlszmsvepyhrjmueaorgtwhctvxmotfsnefcnocicxfkliywnioekyzdxlaisglhxqlvbtixyjoewjwjuqdwkavyiehemlglyvlvvlijmxqkanvzqiguynhwjymxsrhizlrshbuwjmbalprujrzumbhrypbljurcpovoqrwgszdynexxkgqdntvxjdstlmcafqanldefgkshukfidqgprfdddfybcszgwrjohpuvgrjfxxtrqrdyizndqcovzeeekdcixmhfvdwqmwulpcxubjthblusjsbtyvgrraristsfwyfmckfkamuphojcummguextqptomvaldidckpvxjaigzmbmubjfwhlgiwwjzcmmvzpiaqrnynplsmoeufwknqwnigsomnwarlvkzvfeyinqiqyuuxgfebmtorpfqmcbsctlfnporiqvcydlnglopbfxzivieagcmvopvqfmwfeqqvvrwfaiotzoiugkvmflzjawohnwngfotqhuqgaassiprffbuywiiozvxbeildivltzwmblsxknndqbzwvnypxnktsehvvktfhwqhmhcwboxgeuxtehdhhsbcxdgejtjyhdbmdxbgxjwhnttytiuzcyddtbfdbwoonevkgunwcgwofukgqutgjvsqxumzinoyudazwqwdyjvahnsqitatccyilowdnybwvkmgwgvyzqkmycjrohyvsxsldfxjjdmzctmvxekolntzhlscntdzgytacxhuehdfudtshevzqfqkcojgxlizcrnubtshuqwxiolfacnulacrxkuzqadabiwgudztgpncwycqbgzdxedryvukwlsrmjbnmutnzddppokonmfmfnwkgsktjowxvgypelbobwbnzqkbzsdqbppqdagpjzrlfjnzsagrrzxvykizoihecegkbjykkubyleempfziwvvaqysswxvkgkqxhtojqxhhpiurixuqmlroqbzljbkgprxqhtgjhjfqwdhcjzvvqksqcxohczbnvrjocmpwyffmaprfhrehfcrnqmbpmispxvzzvqyjepqdyytypmufxskwdxkynlvrfbznmglcemeytkkldwrcseliwkbcunvflqnjywgcowozjgqnvxgijqeajbuzyiepsfypoubjhbchxvvcojsbvihbzsngdzajjrpsvovqfpabpvchnycwpqjjhrsxltqpulczdcdakklninvwbiazwchbfvjrlcmildhzsevkcbvorbgvzeqbwqneupmjeximleylrqrhyylmelwnhkgcnclzhfxcxwlkohltnprtoyjiclfvxpmyktayaulvjvuueyiybtkhyepwaxpxmamyupwnzsnuulnfduhovlubnqcfwxjxplatfvlmxbvqysctofsfzepnwcmooptggmkvkwwjtnptezxkydlavkokjedumaoeulsmoknnykaofoohtxautxyrlgeoveqmwoblrlpedigpbaownrmdlmlftxpwhafncmicssklsqhznhuucagvskdjrqituzieoxewsiijtcujgvqpzmyjxnvvzdmalddqhejyxtelrrrbkwuqsgkodanhkvymdgmpzhtvckoefwkaselndalkuhfjjoaryjswqvfwdxcnltsahgxwfyfcbelsrukpebfhaafrpixbeejwnrwzlsgsgzykjhgwyuvnoclhhfvovlmcrrbmbsgisefrxtumyjtmgyemvgezekdfkdmorpykirwxtpzgwukphgrbkxpeciggydjogyfamevbcbyicnonsfcgofpqpnaujvdekljndgirbexflelliqggyechahjyyxhlzhcdpdtocfclqlyenlictjcbawxmunwvrionzadqusocbgfanjtbanhofejfmxjgdcgswwdugxttwgaecdpqnkpxkjircebmibpuazzbsyhppfzaaitpskmempbdjmlfwzhruzvcjrbqfcjqnvfbcnmdhsnhqwukwzodpvskkvocqaktkgrzmbymtkxchvnnfjiutyrstvzwydmoguyyrbvgcecbdpwfrwhhvsrzhlegknihmpizlzaqfyjyeihbxvoakuwbpqnfboxcsddttnjlatvgpvgnzusiakazxkwmnidudwclaayibqifadkryltrrgxzvbjmoeuzhmnmeecxjlcecckznobjqulzivksnhrcdtgtrjkccmndcrmpulddgiygjqzjelcxezkgerdcjgiviyseemhccgmvfjokltrkkmlwuvihzyujllghtpvmmuwcukndwnxisogaopuosknokozkadojlitdeidfknqmamftgxukvjxrgdwcieswqrlnrwvtqzwsjkaooenerhmppuehfconjtukxkwwcxgwiggyseodxolbnhwtuxovbkplgsetuosrfkvwijzlnewtjolmopubicypusmhsubbjucgatujpdlkoquoisxwrpdhluqdactttlhtesznwtlnazuoogxzjjjwznezxtuwjawtgxrszzmhiqqimsolocgfvdvecttpqrwlcfcgbhfzbasdhyblonudanzmdiglmrrhfiyskqfobkaimtbvowsahxwuesjjkanmcbexovjbblwnhqheqnizkkkqcdvqzyhriablxizoetjiphfkealnteixkuikjjbezpvwvplmuxijzejhqzrhnpliqbkypvxirserejbseanyhqvufwyeduzpjlgncekxprnukzsdzcwgwozmppzfsjqtuipogowlsqmuxvlslehqpkkllwsdbjuymvxsfuijnqpkxobkqkpcsrixkxztqcqtrwswlosrhzahnumanmnbfhnnljnfhnwkzvpdyqwzggmqytzxvxmpbcbhyalsfusehzsnqqnjaoqozzsyvfzqnifofmzwxftcqolvzituozuyesdjpvraqbrlclttfwuyftenbwmcnfubjcfjvzhzrldbtdxgahxcaekpcipmlyspdxizzswyiwuzcodyepcdjgbmyvxesmhnrpyozkbpxsputeuxqegpydxbbgolhemanxxnjtejnaydmyvafbzlhphwrdcygeflidwzvlztlkpkbgcdxqhyobetzppkllqdpagnluqfbodypitjfoifruedoktqsvvnzfxjrbkveywxdmuyelxzagbipqdbqfuaiolurbqdlgwnoowrzfbthiydiragspuyatdcdmonyozqwmozglwkfsdyrwuvuxaayhxdhbysuuuwhaatzpmnnvqtpvhtnciidivgoaoxkjiyqksedgduqtwhzvsjkgseezgavbzywbbnsyygjmwewwtjlmdujqdpbuyhuioiqyfcrfzgzcdttsxnijodjbpkvubzwvubfzsvcltgamcbiarxnqwxypelkbudqysfayzxkkikdaugcghgalbbdazmhxxdeilcgdnpfqddaaeeccgmwglfdacqjskaxpgmacgosxlskwewerasivniqhatcdgzlyaymuwnmzgaqtqhcnfzcpmepvlgviqfzcwiwbdnzoisczpwuamefwtfrobvyokhubgfrmobyjmwxjvjgajuaipoedhuguywkneqcdnjeqsmbnepmnamngzemsdvcsfzelofrvqqzlqdtoydohunuqmpoffyoffapaforjufxpepiomgsybjgktvnsysvcicryqopbfbjutvgrhxuvrhyappalowykmbjifajropeeuciihvbenohryjukzubuofzugqyehydfauqtulahiprncwvlwhzaibmizmfwghbaonbjoxqqwthslqpmcdvjwkfennuysnkdjgsuksjdrfmzcjnifallkeuizppctxsfezcrzvpotcuakoadntheanqycjrlmluaabzmsvnbccgfrauqmtymtqsgjmpnvexvozhngtuieikebtksgsfvsbsilraucxvtidooqirvjotpknffsbztyjslbbhssbfpepgddbuxnwjirxtrzwlateuvoesaffmiltzzuctwghxrydlhdfdczyojrvhcngiwpjgwmqiigskdjcmlklhslrgsqitpzfgsckaddzjxgquwnnqolseefnefpjdocceafkewdvqvfayijbwkiyjnhjubqxtfkytfjiyafddrtotzdxesfrkcwceaulkwpywliegfruwmymkxxvzsjwimokvfaclrjfddjutjtvnoxcdcaaqulniwiwefwbggysxfbvstwxfoqhoyecduitswsqswmqisvalmnyudwwpqlmgbxszstqvzwunjyzamlejcpxocrsmudsumbgcjvtgqldwsvhmkyfjcwkskyvmsgmmzzbbhnxrrnqtluwvvmyniskowugvskqhfcavxatcnofxfknldbvrdhjdmddwcqieryyhkfywwvdhsqlpastjvsqcsxaucmzbvlctcwgikzmhxhnicrrnsbcdvedqrdvrfrclvzinlekquqawhcwnuighuctwnjzhebpceeclsygqqoaifbtlhstghoeihmmhtxazmijxzfbehwcolaktcdmdnpfokdxiklutbpdwxjgvzqudtmyjbhyhshqggwblcuuiezpubxyleoowikfnzxdmrooapdhitlvfzfocnstbsghzznewapolqxoaehmjjsgpuurmvmbwkdobkrlzzoaziwfcokuzmpiqhindrrjevcahbcrneimvydouviefqyuokneuptfxnvaphbzijfnlszozegxereugdchfvruutqsgruuenyozlkkgppapmkjzqjtgvebbfbcvhjpyylgotvwewlyobrugnepsokrstpnyslabfwkzrulxpauvnkyrobotgftttrlwucgtqqfcjfklwqbpzzemarbvfzrfzsnfttzvkexcmdsbnzbhbitjvtpehtykjvcalsywrcrmfasapnhjdfecxxlpatclarpeifpyxqqktuvheynstyxvmpcroncpcbbbetrcygrlvsecxulbpcjckzaebuobqycilmdtmkbuzygvfzeqwsmnekcuprfrdjdzmaffqjlrggqmgxnhkhxudnxjpumtvgwthsejacejahypuprfadigfgkbjjvxelpzvckmrdkaybdqfszigwsojjqozgtxbizrvyqcnymzkziofejkvxgtzasurvmftynytrkffxblzrwuntvtvvkdjnjxlkjqeoqvxylcphgcitixiohgrhrmftfzdjkxxcxktrkkxrmdxgotspqlphrlrzjybuixsaocnkwkppqgzklzmmgripuvlrnaqhgavsvqqxololxkikzsgazvmfpzinjhkkzugvfmwomlupzovifgutneqbysemgikyusnyidhflmcybteofdirtqqrpicwrweqhrgijqxyffnczxurukglnprlcjhlcwrotufylvcctrjlmuchdotzwzisiobizahooqihneemheickcjelpbskcqvfkoflabnvjqyeojjmniigtgbbmreoqaieharihnpchpkukhdjrpdrxtqzoezbgyjplxatequmfogqgmvsuuxpxtvokocuzjhnzsqscibyuaegrvtqngvlwulgstboerwfdlynbmauemwcuktrazpfvsizm", "cgslvaouqkanoablrsnttfntqsmpylzunkcejqzhecbttisuinjdbuedkwsnredvwxgugktwbvprcjqywxgoqrtyzcfrviwtvdnvedxrkizyrkigafeabvqmfnckxdzixlwfbwkpjmthumhtqcnpancmorzajvjtjawsbkgfmhjxzygqwqbtvngvhtjvrxvwxxotcpejgprcbctywcgahnydziozlqakglyuvzrneaihwkbimehhzdohelpiqyzqdwgacwcldjugvwwuuuvdzrqmhlraczidoijzsytzdtkptiztqephmqmfkidilpkzxvgbiibzerqhzjfwsgcsqimjdsyslhhdzfffaqzbzscpotcdqlhbregmamfhjhbmanntbpvfsratuvtxkojayxawiuqfevmnffcgkzwrugjonbsthugtavvrgtganyqlbuuzmoysquowjkowlykiaivwduwxfelsgscbsyqxgvptolpifapcojceqlcjeapclscaygdgnqwksnefkvugzrfwsxggoojdulckjuvytcevrsvitfpwpzqpyhtrhtsctrzaxritkyptrjjupwkghbadwvxmjdvwnivljvfocfsgvfovgxbnpbkclfvzibxjsguzduufhqgxvjqffqhccmisoqqjldfiitebleezszekoyhhklixbdnzwxxuvunscxncsnwhwwdufulvrwefijcbybofuirnjncdqoaueoutcdnkrgrcvripllwvpovpblqubfvalrryuvsxifbushnhbzygtwgblkdynzqubbgtalbndcphtltowcmuimmzebfeuzvrtyvxlfnpxorbzvgayxkvknaawhdxcmdmgvkcsawqclyqyeguwxstmvmmwoyebpsomietkffftwiisyuebekcdyknonjtxxdhhhlwmgkpdowccyjwmwsdtgbzhwgzhkzosvdzqibxdaeozguquctrfxirwvmtaudwetlvugcrzgazemnvypcblponpzpiesmsiohwlkgxpemqvsdlrqyudbolhzwgbwicvwxfvaxbjyiyecefxrirtssxdfotxtyxcomksaqxggdemtkwkjivcxtozuozylhqayqtosgjomftvzqapoyoiajttmtyzxexengqfyljqulccprydvxsrdyybigakcneldiupxrgrqvhxsswkzhnaujkfdqpydrbfvosfchaczwwzjsnwmjunniqythojofhmduchsywrhjgnhgwwyzpqccgibnjemmxbtnqzabhezhksapiqnbwlidrainuzqbenuydkxcszldzmotxjmdqrjighophilegldjspcmohrtiiuehqinglprvvjclxdgfewcqxercqhvcthokyhsalusnmoewtkfvsmsmpwpdzziooekgflsuhzjbpdwavmdzjlqbpxwzxqcumevbklzyldlcnefxnbpwdnbajbbojajvwcznhilpxjquoekweygowzqynnifofgmifqemuvrvfcwkntaupvojcyganlsgvoqhiojhpjbcrjflckokqwohicghezkbhbjpalijrtykdljxoxrxvsvmrnmfvldqtuutyextyznbdqimpexvtslkwigukmqfvuaqpsfhxwgnzykvmvkkquebspueyyiqiisrovqsnrlxrdionabgcppechauuhcsmivjkcevvvsavwdnrtoswqibjztchrlexwzludecvmsryuynqiguwjtumpquaysuemlikbeuxpgcggppwvootyqdsxadhgmzokdtusftpjuycbaodsupxinfsqddarwitwanyrelkbeqbudkljlsdhrszwpkzpmtaqopkzhctchqfupivhlywmhgnfrabfajqqmjomhsggptlpncnshigppnfbyjupiclbvgswpggpulxrfzywyxzfztpifvzmketbiwuezbkdbprfnyycnaqsluchkxgbknowariosjsmhfmkbblfumbbnknxmuhqsrvnnluuzqyfnaahopmauysgoqpwuzoypwfithiezturrdfpubxeoclqhzvtjeifspcdjjbbzsbapebxffnqxgemqlnflxyxtwusqefntswjbihyybdklmcjntozyzzholgbxxvaizwozvxtxxisfahmrrhdignyjfzsppylzwiarfcurkxymjiqxnmzeukvlcucmjdtrynalaguksbjtwqtufjycfesbngzhphiaqobieolnbfpxkdlyhimoeibgkleoorcmzquzhdnhjphkdekahrqhzfrovrwexymdzjnausnhdbazwhmjridlytdtdjkouesnvznlifzoacoszmjwukjednijraspfsrfjxjlanxywhhexjeiuznhnlqwpesjumdanpmkpqnrxmqjsypfnnmqrdwwkkrmnezjcbcrxzdcclpbxdrrpubcnwomtwjgxqyyugjpuwzybxjhauopgcdnitacztzfemqfwyelvrmfploglrzthoaeqelcvmsllamobyqmcwwespjqanyerikmeeoetwxjwhfbsyblvnvhtqdwjoylpacfqoredjdudmnbynvbvofvibnkobthdmtgsboaigyqirmosouvazwsdpdobdlnekrpuartpzsquskkywcpnvmecvmsooygunqcfljpsypcnvwhivoiqhsrztbtigmvrvtdcaqjhowajnquqajctmpigqscqlixfkljjwvmijtbegnchfksrihesjrocaixlambjwuiljflrsqckotjribumfphxdomjaifjlyusrfuezsifgtmneevatwoqgvaqajuuxogcrkqfkvcliumvzefizixbgftsczommcgsphviesvsnnxuqohipyfwrxbjiyrtjkfhaqmbmteecqlonozwuhfqtczvbldzijgunzetkquzgqkbctqkdsmvawvvqbdwhbvnimmuhdtyamvkseghdsswvieczrgfhbfpqakupkxjqzorlbukyamzyibkqzncrzznytukpctiaczakeprinhbcjwzdkbdvzfsbsujyfczdoaotpwharisxdgnbccegznlkztptcbmdjjynhqygukwpmggivfmuwnvrzfnemlsfufazyaenkzcuerhnzcotkdwgcrhtiaktauyqgazlytceptpbvjblhculcfvbygejbdcfspfgpgcfvxrtgdpdsvbcfybiieenfvlfdydtdcbtacuwxvkzunqijuymyafylomcanmmxmsvvflifkiailkttxdaelqtmsyifygppfdtxwkdtjcfgxnngsvvbklhtnhpyjhnhplmxiohwibtgfnfanulamoqqezgzskynwhoazqopgimbmstlxnffnyctnszpsoiclnvnegosyqtpapijcpqoegnqzqxyvdoukfkoeqswfzwvqkqfrjtfnvtnqogopatplbvkconcerejoyzpabuhdislcxyiehevaqvmdcwjybwkghhswzxblzletstybveyxdxlsnudwlbwmcaaqhrjzdgrdmkjvweuivmdfqnexmzuyknyoutzzkkzlveqigupbkgiuyciebqdifgdpjlqypwndccctpmmwcyflspljtodktjikczzwpuyzzvflsctdraowqfjkkqbqjtbxmcgnrrtvrozfthwypsivbsgrypeiwgjddiexnfuyodfdlxujkdjsikmolmsdsvergothczdxxqrfznaqisijnddncbwdmjjjrhujllxskgjzhczvrfroajovpflvwwjxxssarsrmamelirdxclxvlyqnquydovuzrultahoospnjnkqtbzoayfoeshgrwrntlmemugqwjokgwdagnhcpycwbwqtbndhcbxgfektmkjvshffjqlqyjlhbalmzrdfigkgxhjxrlqiuxluspanvvordgzoyooboqdicikhlcmxrgfygdiwkhuncxpkdgnkwyvivmkcsxqcgylitcklwadtodkujsmxxdhqnojcoxlzrkxfdkqsftlzokcccjzewlcthneqzkmcxrhuskfsqompeesapufhnwntfasptntzawbdxoenmvntimgprpavzoefurzotucxudxzdrjszhjwmrexluwonvsmbczyrnsxyeknvacwwwacnveakisxmqqmukswimsmkuchdxapoqfqpwzgrwfdtvfiykfbekiuhotncochhemyeviyosglcgqtmfphlqlzpjutuzgfdiclkyrlbxnodpulxenjuekcjejwgnalrlgkqqcnlwagvyecgmrccpoesurzuzwernfwmkdxyzbvedszpgrewolugeoddklopfqcgqvvdbwfkokuyhdnbmgvsikhowhtmvokicwewvuzonsanvvsdlfbnnbwrdzgbkapmvtlbbskmvzpbwyxeirmigqqdeqeqpufbufqmpbrtazwryucktseglzbusueammsrujrrszuklgpfmloyiwnxifrtnvivtscumgyrvephxuktucwwcotzjbslbungquvsrqiyiigarvmcxkcqqtdpsxsutrhcdagtmchewzyojbyruryaidywqghxgsmtyogxheluqvdbmkrvoxlcdavamgjorvrvjmfamxcnzyrzgcpiotjbdvsdejhugprgdkuktgrsbxirjmoyubcnaxoebvnxlhbohgpuhqdysldltivhysywmscrimwhsoavyrcyookcjazkafugqxiratvrcdvxmedajzolrplpnwenfcfwfbkmtdjwslgrrkkzydhlqxjgeangkmwweucktiwbcaedfllupaflazeukbvzlwfmqcrxixbtlibplcuijzjyflhruagyhvizsnembekjkjnkglkdnkxumkmhppoqilumgbysetezbdyfkzihgmwesiyjgoiwfzmmkrohzstxafpfyrdavakozglfplmgymejbqlxkahajuzejyfyoexjvqijfwfazxwmbbxtmgykolmcvreeqziryvqaqpuuovhshebmksfhbxjqjlmzpxbpyflvuuaklbkwtferjwodwcghypzxyctkbyvwlsjtaayyudpycyjseifoqbtriwltlgfbszsdvyzfekucmuxesohxyumlrifnauwpothtxjtcwqigtaufkujrmbjcgzwbldhaurltxprwtkjgwufqpqvvgiasrpyeemencwuozoygzqestelfrjohflqlrnafvyzjayzbygqgzfshpmikjwnnalfhuvvkvoedxgahvfdmfgfrllfgdjpdhkewmlrmoprdicnfcedawhifcnjjnnfizznbbipxdvnaunqjbvbruppnxixteebypzybnuytzlgwggoxjgrjwovmgkxuxxhkukuyhjqvvlfedbuzhcdegalluermfnwfsqkgynmbcjnxulvmpmddngwumqxwpzxvwljqamijjwoshcfwkdomcadfxlguhsuyigrbkoskttxivkcetzkpjylcphbgxniixewdysgkttipxbsbvytbbnexajrwvcjzwjoreaubpstrbmtelhpbqhexubdohddooaxqxqbfsiqlsdtdlqlqkgtveprdannpiciunvrjxkpldliwxgtdzmzulsmlnmlmjpajaczjreeaynbjaoonycpftmkltlvgemmelhfdudbeqaxlhvypchuqvuoenarpfqldpxazpkdczhvhttdylrqyfhygsoigifjhncnxthxbhykpccfukxlnetdptuxwxuqgnlvfgpnewfjajoztioikixrpooxaabygjdlwdszyjawqfxgtjgmmaikmctfleqprcrzixaxzmrpvtvgprcumhxxsughqrmqpfhnxjgujdbskcjbqjowzytqwbfadgmldlrtiyixjfmchkjivpaikovnbxnrlnhfjefvhbefxjzhdmtwmlwewenoatqqmnbzfrwmzbcpsxmdwhhgweoslugudzpvvxsdqdqvpwzqrcdtfczcyakeucpljimozooczkkvzftzetuvwfkrinsobeuhkmufiyiquqzfkriwpzyjkoyacwxcvwbiozlohngaelqhuaeklbtpsklzuicttiwlryltylnkreuccgwtthoyksmerpkyuysjhtxwrqssaazegczirbulobfmomdavcjaocqmpfaonhegseaivuydasqkwtqlugsvqvmropkzbrkhnzpostrrvshetbfuwuuonjncrzndsffmzqwfqnmgnflactxuiqsokjgfivecwerzmmetterqxveoyddhgedgghizvvjwyeusbjfyl"));
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            m1.put(s1.charAt(i), m1.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            m2.put(s2.charAt(i), m2.getOrDefault(s2.charAt(i), 0) + 1);
        }
        if (m1.size() != m2.size())
            return false;
        for (Map.Entry<Character, Integer> entry : m1.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (!m2.containsKey(key) || !value.equals(m2.getOrDefault(key, 0)))
                return false;
        }
        return true;
    }

    //better approach
    public static boolean areAnagramsV2(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>(s1.length());
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) - 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0)
                return false;
        }
        return true;
    }
}

package easy.LC1881;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaximumValueAfterInsertionTest {


    MaximumValueAfterInsertion maximumValueAfterInsertion = new MaximumValueAfterInsertion();

    @Test
    @DisplayName("Example 1: Input: n = \"99\", x = 9")
    void example1(){
        Assertions.assertEquals("999" ,maximumValueAfterInsertion.getMaximumValue("99",9));
    }

    @Test
    @DisplayName("Example 2: Input: n = \"-13\", x = 2")
    void example3(){
        Assertions.assertEquals("-123" ,maximumValueAfterInsertion.getMaximumValue("-13",2));
    }

    @Test
    @DisplayName("Example 2: Input: n = \"-132\", x = 3")
    void example2() {
        Assertions.assertEquals("-1323", maximumValueAfterInsertion.getMaximumValue("-132", 3));

    }

    @Test
    @DisplayName("Example 2: Input: n = \"-9821663999352313874889795577334717524766455898622933947613248796556561229948237222949269699917627223525375638842561598351597179641435896295311689497577343585872219529243841686664982346762762467512638895944794789581676741255322752379467862838887344968999145771356949992364516734121765592368787351736823864529564714113176691824822788473567943771791487231838541622286283733456491991976933587632964574517536515831662197259369419121479127431272833765543326334644218416736726898333625939898624826847416758324859924422533316693863959912344366825161195253175713896544681947431389926894426993748379862227666574343289291626791329867134465713943539537222251296697731749693521737396751359799368448136893194219546549657337563284675987313835317696913513458857217468858666464737958316436846971969826157762586978144191399641474895647353856684693269751947973622586643482977713937683569949313714315331937798534853574621984149451458553482374922618445145145454842528638236795542895455943764751373434962828688461497573325339196467584554339357547642725832193439495817754623882164993445977962542235972549745541322369977721445658199641592769382769341453567823393885561748792992132196491255926684991572449964578187193796759335743866272228819544669466773167693983511167293378145275579358598469629179496312871525666547883627877888411137187351435524919536336927861358271721847427419331362662319941996444858975322397368523534349555748586376273527254653664257787832893881874643724823165241429981886953154277722694636487838617973882919369196372747443646132344142445472549826146165147952584756676177699384572382197813718616632535394994449592472816562765683433958784861918518446217381343369925497492736951634479964277397578442826245322695876856858975382712657721314387552885455762722818675568923187654388368958151268655211614943649399961568618757799181738647114469162387673675273164253563182239649347971792438128418671873697585948828933394463613855296159366465691513963816263999575493189781718219547572827358521623694428689288771426388886369261319327537959222629715333349963443862674647894887115956957833348645224134117443634423272886181736444959151714112772864443833527156584728865142437883541372597932554342988157661793971655945176862771645392246851971845939418997154121782756994225479148344443546346798291695832679723345782976681645116433395913885166355979372262235447884966459526768939632112917441614761344272237569419786861899614155821745628522954444132129433194598812285923182498896828596735374888443679247474733614382193751322116717345245292584981268765348716263767458247968135558899719664725759523441836391585448344763363217438767658845218311161539783685381324696915629267696187334559165243647523141329161452297513143642173668777559281382234495968463269857219879138423184918888339643755919981415688395882953672866698274298861293425994841451717133861254196577485452714922146636668192121426169555156968844147152997953211711739641262894224856734281741485754143298668788191653481459676121471719582392392311541646583221489792647536895197342573296866767425323794483571697656948623144287487567448343458313438343296282593942248389849544443847845362248357673361481877362379152698355985151943115613921171568955144494174673385664565881668968991249546842335178895799365818771924983974221322643558871558641346666824884388346627979172715625835271923679911852422243864164749771974894362461334624895482128132613262745525536686635396853481277546854398361321659853672536189392721432122761473183836143484669358632888558269998355549424569914522591946914333786786141376256389747246272716138352593333383839546159347354621833856855741519143137413637727141526884153339434481784539913977173138471342536465746635465537756616475619434647589472927751574112889373417659643154711753364566684713299616656938726155164758524246315148326358167318499928624678437997135925841195377951518741755614952357662474676337499989831648473977663425596697581967824457328399568415811924557383732995194211247131952415624346316985122646349286783325232144255765252457794564468268853134226337912246764933829812677856476933552596223629646597174381155184927784977399691784592622896777784914661862821145326438243356115357339453116787513735337894613478446621679553868319383325512451783546729374883946133865354351375837474494813145682262311793255577552499588224371142696325236147389612235756939999915249791724636445474157637733877723792245852314714881246742231484942769916562235323884855938373356423585915772675363959688231523447821335595761445522693252831342542495371315357827977837884732181657288846896458456577274484173922842655845916348696896533239339498376578219859355318166573117778742785763375447713618542955465619819748657952487166547161784571995467521427877623619729391995354949256876162385813787361774219774894358599322279466385931188696988169342124535591319813382664888554446714451469752616217248977387544878892978699483883172127481188366893663522899361752173452271325643745495246539975454673525589246243149328463538493258251292742567324775665884771421947656113889879566965626921646415479548818958675923538443984924432114795634695357894477579827547482973841674995255953685922517924369484483625694684693452743357473446213939435131138266443116254287584149776815878717665745995666193766947799343657257244688427339848345555374775332881937515884547524446279813424778615939274639718864842127961911291386182998673183322374369614947318888699387892434978637237747266755563532346479482816119152773378925791531328622443699927292838146968393956129328586161754416819357259425123957798265683852136133563279311742196979178723656584394744198288814693233663633535828111822425116887968389361596348556427786455641891648398271988442343136148442277222751664344713977444514625988\", x = 8")
    void example4() {
        Assertions.assertEquals("-8982166399935231387488979557733471752476645589862293394761324879655656122994823722294926969991762722352537563884256159835159717964143589629531168949757734358587221952924384168666498234676276246751263889594479478958167674125532275237946786283888734496899914577135694999236451673412176559236878735173682386452956471411317669182482278847356794377179148723183854162228628373345649199197693358763296457451753651583166219725936941912147912743127283376554332633464421841673672689833362593989862482684741675832485992442253331669386395991234436682516119525317571389654468194743138992689442699374837986222766657434328929162679132986713446571394353953722225129669773174969352173739675135979936844813689319421954654965733756328467598731383531769691351345885721746885866646473795831343684697196982615776258697814419139964147489564735385668469326975194797362258664348297771393768356994931371431533193779853485357462198414945145855348237492261844514514545484252863823679554289545594376475137343496282868846149757332533919646758455433935754764272583219343949581775462388216499344597796254223597254974554132236997772144565819964159276938276934145356782339388556174879299213219649125592668499157244996457818719379675933574386627222881954466946677316769398351116729337814527557935859846962917949631287152566654788362787788841113718735143552491953633692786135827172184742741933136266231994199644485897532239736852353434955574858637627352725465366425778783289388187464372482316524142998188695315427772269463648783861797388291936919637274744364613234414244547254982614616514795258475667617769938457238219781371861663253539499444959247281656276276834339587848619185184462173813433699254974927369516344799642773975784428262453226958768568589753827126577213143875528854557627228186755689231876543883689581512686552116149436493999615686187577991817386471144691623876736752731642535631822396493479717924381284186718736975859488289333944636138552961593664656915139638162639995754931897817182195475728273585216236944286892887714263888863692613193275379592226297153333499634438626746478948871159569578333486452241341174436344272237569419786861899614155821745628522954444132129433194598812285923182498896828596735374888443679247474733614382193751322116717345245292584981268765348716263767458247968135558899719664725759523441836391585448344763363217438767658845218311161539783685381324696915629267696187334559165243647523141329161452297513143642173668777559281382234495968463269857219879138423184918888339643755919981415688395882953672866698274298861293425994841451717133861254196577485452714922146636668192121426169555156968844147152997953211711739641262894224856734281741485754143298668788191653481459676121471719582392392311541646583221489792647536895197342573296866767425323794483571697656948623144287487567448343458313438343296282593942248389849544443847845362248357673361481877362379152698355985151943115613921171568955144494174673385664565881668968991249546842335178895799365818771924983974221322643558871558641346666824884388346627979172715625835271923679911852422243864164749771974894362461334624895482128132613262745525536686635396853481277546854398361321659853672536189392721432122761473183836143484669358632888558269998355549424569914522591946914333786786141376256389747246272716138352593333383839546159347354621833856855741519143137413637727141526884153339434481784539913977173138471342536465746635465537756616475619434647589472927751574112889373417659643154711753364566684713299616656938726155164758524246315148326358167318499928624678437997135925841195377951518741755614952357662474676337499989831648473977663425596697581967824457328399568415811924557383732995194211247131952415624346316985122646349286783325232144255765252457794564468268853134226337912246764933829812677856476933552596223629646597174381155184927784977399691784592622896777784914661862821145326438243356115357339453116787513735337894613478446621679553868319383325512451783546729374883946133865354351375837474494813145682262311793255577552499588224371142696325236147389612235756939999915249791724636445474157637733877723792245852314714881246742231484942769916562235323884855938373356423585915772675363959688231523447821335595761445522693252831342542495371315357827977837884732181657288846896458456577274484173922842655845916348696896533239339498376578219859355318166573117778742785763375447713618542955465619819748657952487166547161784571995467521427877623619729391995354949256876162385813787361774219774894358599322279466385931188696988169342124535591319813382664888554446714451469752616217248977387544878892978699483883172127481188366893663522899361752173452271325643745495246539975454673525589246243149328463538493258251292742567324775665884771421947656113889879566965626921646415479548818958675923538443984924432114795634695357894477579827547482973841674995255953685922517924369484483625694684693452743357473446213939435131138266443116254287584149776815878717665745995666193766947799343657257244688427339848345555374775332881937515884547524446279813424778615939274639718864842127961911291386182998673183322374369614947318888699387892434978637237747266755563532346479482816119152773378925791531328622443699927292838146968393956129328586161754416819357259425123957798265683852136133563279311742196979178723656584394744198288814693233663633535828111822425116887968389361596348556427786455641891648398271988442343136148442277222751664344713977444514625988", maximumValueAfterInsertion.getMaximumValue("-9821663999352313874889795577334717524766455898622933947613248796556561229948237222949269699917627223525375638842561598351597179641435896295311689497577343585872219529243841686664982346762762467512638895944794789581676741255322752379467862838887344968999145771356949992364516734121765592368787351736823864529564714113176691824822788473567943771791487231838541622286283733456491991976933587632964574517536515831662197259369419121479127431272833765543326334644218416736726898333625939898624826847416758324859924422533316693863959912344366825161195253175713896544681947431389926894426993748379862227666574343289291626791329867134465713943539537222251296697731749693521737396751359799368448136893194219546549657337563284675987313835317696913513458857217468858666464737958316436846971969826157762586978144191399641474895647353856684693269751947973622586643482977713937683569949313714315331937798534853574621984149451458553482374922618445145145454842528638236795542895455943764751373434962828688461497573325339196467584554339357547642725832193439495817754623882164993445977962542235972549745541322369977721445658199641592769382769341453567823393885561748792992132196491255926684991572449964578187193796759335743866272228819544669466773167693983511167293378145275579358598469629179496312871525666547883627877888411137187351435524919536336927861358271721847427419331362662319941996444858975322397368523534349555748586376273527254653664257787832893881874643724823165241429981886953154277722694636487838617973882919369196372747443646132344142445472549826146165147952584756676177699384572382197813718616632535394994449592472816562765683433958784861918518446217381343369925497492736951634479964277397578442826245322695876856858975382712657721314387552885455762722818675568923187654388368958151268655211614943649399961568618757799181738647114469162387673675273164253563182239649347971792438128418671873697585948828933394463613855296159366465691513963816263999575493189781718219547572827358521623694428689288771426388886369261319327537959222629715333349963443862674647894887115956957833348645224134117443634423272886181736444959151714112772864443833527156584728865142437883541372597932554342988157661793971655945176862771645392246851971845939418997154121782756994225479148344443546346798291695832679723345782976681645116433395913885166355979372262235447884966459526768939632112917441614761344272237569419786861899614155821745628522954444132129433194598812285923182498896828596735374888443679247474733614382193751322116717345245292584981268765348716263767458247968135558899719664725759523441836391585448344763363217438767658845218311161539783685381324696915629267696187334559165243647523141329161452297513143642173668777559281382234495968463269857219879138423184918888339643755919981415688395882953672866698274298861293425994841451717133861254196577485452714922146636668192121426169555156968844147152997953211711739641262894224856734281741485754143298668788191653481459676121471719582392392311541646583221489792647536895197342573296866767425323794483571697656948623144287487567448343458313438343296282593942248389849544443847845362248357673361481877362379152698355985151943115613921171568955144494174673385664565881668968991249546842335178895799365818771924983974221322643558871558641346666824884388346627979172715625835271923679911852422243864164749771974894362461334624895482128132613262745525536686635396853481277546854398361321659853672536189392721432122761473183836143484669358632888558269998355549424569914522591946914333786786141376256389747246272716138352593333383839546159347354621833856855741519143137413637727141526884153339434481784539913977173138471342536465746635465537756616475619434647589472927751574112889373417659643154711753364566684713299616656938726155164758524246315148326358167318499928624678437997135925841195377951518741755614952357662474676337499989831648473977663425596697581967824457328399568415811924557383732995194211247131952415624346316985122646349286783325232144255765252457794564468268853134226337912246764933829812677856476933552596223629646597174381155184927784977399691784592622896777784914661862821145326438243356115357339453116787513735337894613478446621679553868319383325512451783546729374883946133865354351375837474494813145682262311793255577552499588224371142696325236147389612235756939999915249791724636445474157637733877723792245852314714881246742231484942769916562235323884855938373356423585915772675363959688231523447821335595761445522693252831342542495371315357827977837884732181657288846896458456577274484173922842655845916348696896533239339498376578219859355318166573117778742785763375447713618542955465619819748657952487166547161784571995467521427877623619729391995354949256876162385813787361774219774894358599322279466385931188696988169342124535591319813382664888554446714451469752616217248977387544878892978699483883172127481188366893663522899361752173452271325643745495246539975454673525589246243149328463538493258251292742567324775665884771421947656113889879566965626921646415479548818958675923538443984924432114795634695357894477579827547482973841674995255953685922517924369484483625694684693452743357473446213939435131138266443116254287584149776815878717665745995666193766947799343657257244688427339848345555374775332881937515884547524446279813424778615939274639718864842127961911291386182998673183322374369614947318888699387892434978637237747266755563532346479482816119152773378925791531328622443699927292838146968393956129328586161754416819357259425123957798265683852136133563279311742196979178723656584394744198288814693233663633535828111822425116887968389361596348556427786455641891648398271988442343136148442277222751664344713977444514625988", 8));

    }


}
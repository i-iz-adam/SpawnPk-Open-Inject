package rs;

import com.sun.jna.platform.win32.G;
import com.sun.jna.platform.win32.aU;
import com.sun.jna.platform.win32.m;
import org.lwjgl.opencl.AMDDeviceAttributeQuery;
import org.lwjgl.opencl.AMDOfflineDevices;
import org.lwjgl.opencl.CL10;
import org.lwjgl.opencl.QCOMEXTHostPtrIOCoherent;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GLXEXTContextPriority;
import org.lwjgl.opengl.GLXINTELSwapEvent;
import org.lwjgl.opengl.NVFloatBuffer;

/* JADX INFO: loaded from: client-final.jar:rs/class_73.class */
public class class_73 {
    public static void a(ObjectComposition objectComposition, int i) {
        b(objectComposition, i);
        switch (i) {
            case 6926:
                objectComposition.an = new int[]{6932, 50164, 50165, 50167, 50168};
                break;
            case 11986:
                objectComposition.an = new int[]{6932, 50164, 50165, 50167, 50168};
                break;
            case 38847:
                objectComposition.an = new int[]{G.az, 4873, 50192, G.aA, 50191};
                break;
            case 38848:
                objectComposition.an = new int[]{G.az, 4873, 50192, G.aA, 50191};
                break;
            case 41451:
                objectComposition.an = new int[]{50187};
                break;
            case 41453:
                objectComposition.an = new int[]{50190};
                break;
            case 42517:
                objectComposition.an = new int[]{50191};
                break;
            case 42518:
                objectComposition.an = new int[]{50191};
                break;
        }
    }

    public static void b(ObjectComposition objectComposition, int i) {
        switch (i) {
            case 83:
            case 84:
            case 85:
            case G.el /* 2639 */:
            case 3550:
            case CL10.CL_PROGRAM_DEVICES /* 4451 */:
            case 4657:
            case 4909:
            case 5974:
            case 7261:
            case 7526:
            case 9289:
            case 10606:
            case 11769:
            case 13141:
            case 13506:
            case 13697:
            case 13725:
            case 14927:
                objectComposition.an = new int[]{50116, 50009, 50075, 50118, 50074};
                break;
            case aU.iR_ /* 559 */:
                objectComposition.an = new int[]{50043};
                break;
            case 560:
                objectComposition.an = new int[]{50056};
                break;
            case 561:
                objectComposition.an = new int[]{50067};
                break;
            case 673:
                objectComposition.an = new int[]{50049};
                break;
            case aU.hS /* 738 */:
                objectComposition.an = new int[]{50049};
                break;
            case 775:
                objectComposition.an = new int[]{50049};
                break;
            case aU.pN /* 1434 */:
                objectComposition.an = new int[]{50037};
                break;
            case aU.pU /* 1441 */:
                objectComposition.an = new int[]{50037};
                break;
            case aU.qn /* 1460 */:
                objectComposition.an = new int[]{50037};
                break;
            case 1484:
                objectComposition.an = new int[]{50037};
                break;
            case 1485:
                objectComposition.an = new int[]{50037};
                break;
            case 1490:
                objectComposition.an = new int[]{50037};
                break;
            case aU.qA /* 1503 */:
                objectComposition.an = new int[]{50037};
                break;
            case G.aW /* 2238 */:
                objectComposition.an = new int[]{50049};
                break;
            case 2733:
                objectComposition.an = new int[]{50049};
                break;
            case 2734:
                objectComposition.an = new int[]{50049};
                break;
            case 2735:
                objectComposition.an = new int[]{50049};
                break;
            case 2736:
                objectComposition.an = new int[]{50049};
                break;
            case 2737:
                objectComposition.an = new int[]{50049};
                break;
            case 2738:
                objectComposition.an = new int[]{50049};
                break;
            case 2739:
                objectComposition.an = new int[]{50049};
                break;
            case 2740:
                objectComposition.an = new int[]{50049};
                break;
            case 2741:
                objectComposition.an = new int[]{50049};
                break;
            case 2742:
                objectComposition.an = new int[]{50049};
                break;
            case 2743:
                objectComposition.an = new int[]{50049};
                break;
            case 2744:
                objectComposition.an = new int[]{50049};
                break;
            case 2745:
                objectComposition.an = new int[]{50049};
                break;
            case 2746:
                objectComposition.an = new int[]{50049};
                break;
            case 2747:
                objectComposition.an = new int[]{50049};
                break;
            case 2748:
                objectComposition.an = new int[]{50049};
                break;
            case 2749:
                objectComposition.an = new int[]{50049};
                break;
            case 2750:
                objectComposition.an = new int[]{50049};
                break;
            case 2751:
                objectComposition.an = new int[]{50049};
                break;
            case 2752:
                objectComposition.an = new int[]{50049};
                break;
            case 2753:
                objectComposition.an = new int[]{50049};
                break;
            case 2754:
                objectComposition.an = new int[]{50049};
                break;
            case 2755:
                objectComposition.an = new int[]{50049};
                break;
            case 2756:
                objectComposition.an = new int[]{50049};
                break;
            case 2757:
                objectComposition.an = new int[]{50049};
                break;
            case 2758:
                objectComposition.an = new int[]{50049};
                break;
            case 2759:
                objectComposition.an = new int[]{50049};
                break;
            case 2760:
                objectComposition.an = new int[]{50049};
                break;
            case 2761:
                objectComposition.an = new int[]{50049};
                break;
            case 2762:
                objectComposition.an = new int[]{50049};
                break;
            case 2763:
                objectComposition.an = new int[]{50049};
                break;
            case 2764:
                objectComposition.an = new int[]{50049};
                break;
            case 2765:
                objectComposition.an = new int[]{50049};
                break;
            case 2766:
                objectComposition.an = new int[]{50049};
                break;
            case 2767:
                objectComposition.an = new int[]{50049};
                break;
            case 2768:
                objectComposition.an = new int[]{50049};
                break;
            case 2769:
                objectComposition.an = new int[]{50049};
                break;
            case 2770:
                objectComposition.an = new int[]{50049};
                break;
            case 2771:
                objectComposition.an = new int[]{50049};
                break;
            case 2772:
                objectComposition.an = new int[]{50049};
                break;
            case 2773:
                objectComposition.an = new int[]{50049};
                break;
            case 2774:
                objectComposition.an = new int[]{50049};
                break;
            case 2775:
                objectComposition.an = new int[]{50049};
                break;
            case 2776:
                objectComposition.an = new int[]{50049};
                break;
            case 2777:
                objectComposition.an = new int[]{50049};
                break;
            case 2778:
                objectComposition.an = new int[]{50049};
                break;
            case 2779:
                objectComposition.an = new int[]{50049};
                break;
            case 2780:
                objectComposition.an = new int[]{50049};
                break;
            case 3738:
                objectComposition.an = new int[]{50037};
                break;
            case 4316:
                objectComposition.an = new int[]{50037};
                break;
            case 4320:
                objectComposition.an = new int[]{50037};
                break;
            case aU.wK /* 4324 */:
                objectComposition.an = new int[]{50037};
                break;
            case 4709:
                objectComposition.an = new int[]{50049};
                break;
            case 4892:
                objectComposition.an = new int[]{50037};
                break;
            case aU.xC /* 5018 */:
                objectComposition.an = new int[]{50037};
                break;
            case aU.xG /* 5022 */:
                objectComposition.an = new int[]{50037};
                break;
            case 5118:
                objectComposition.an = new int[]{50049};
                break;
            case 5119:
                objectComposition.an = new int[]{50049};
                break;
            case 5120:
                objectComposition.an = new int[]{50049};
                break;
            case 5319:
                objectComposition.an = new int[]{50037};
                break;
            case 5320:
                objectComposition.an = new int[]{50037};
                break;
            case 5321:
                objectComposition.an = new int[]{50037};
                break;
            case 5322:
                objectComposition.an = new int[]{50037};
                break;
            case 5323:
                objectComposition.an = new int[]{50037};
                break;
            case 5526:
                objectComposition.an = new int[]{50037};
                break;
            case 5530:
                objectComposition.an = new int[]{50037};
                break;
            case aU.zP /* 6002 */:
                objectComposition.an = new int[]{50037};
                break;
            case 6177:
                objectComposition.an = new int[]{50091};
                break;
            case 6289:
                objectComposition.an = new int[]{50037};
                break;
            case 6378:
                objectComposition.an = new int[]{50037};
                break;
            case 6390:
                objectComposition.an = new int[]{50037};
                break;
            case aU.BE /* 6722 */:
                objectComposition.an = new int[]{50037};
                break;
            case aU.BF /* 6723 */:
                objectComposition.an = new int[]{50037};
                break;
            case aU.Cd /* 6822 */:
                objectComposition.an = new int[]{50037};
                break;
            case aU.Ci /* 6827 */:
                objectComposition.an = new int[]{50037};
                break;
            case 7389:
                objectComposition.an = new int[]{50049};
                break;
            case 7390:
                objectComposition.an = new int[]{50049};
                break;
            case 8719:
                objectComposition.an = new int[]{50049};
                break;
            case 8721:
                objectComposition.an = new int[]{50049};
                break;
            case 8722:
                objectComposition.an = new int[]{50049};
                break;
            case 8723:
                objectComposition.an = new int[]{50049};
                break;
            case 8824:
                objectComposition.an = new int[]{50037};
                break;
            case 8825:
                objectComposition.an = new int[]{50037};
                break;
            case 8935:
                objectComposition.an = new int[]{50037};
                break;
            case 8941:
                objectComposition.an = new int[]{50037};
                break;
            case 9533:
                objectComposition.an = new int[]{50091};
                break;
            case 10095:
                objectComposition.an = new int[]{50049};
                break;
            case 10176:
                objectComposition.an = new int[]{50049};
                break;
            case 10281:
                objectComposition.an = new int[]{50091};
                break;
            case 10465:
                objectComposition.an = new int[]{50037};
                break;
            case 10468:
                objectComposition.an = new int[]{50037};
                break;
            case 10597:
                objectComposition.an = new int[]{50037};
                break;
            case 10600:
                objectComposition.an = new int[]{50037};
                break;
            case 10627:
                objectComposition.an = new int[]{50049};
                break;
            case 10628:
                objectComposition.an = new int[]{50049};
                break;
            case 10629:
                objectComposition.an = new int[]{50049};
                break;
            case 10630:
                objectComposition.an = new int[]{50049};
                break;
            case 10631:
                objectComposition.an = new int[]{50049};
                break;
            case 10632:
                objectComposition.an = new int[]{50049};
                break;
            case 10633:
                objectComposition.an = new int[]{50049};
                break;
            case 10634:
                objectComposition.an = new int[]{50049};
                break;
            case 10635:
                objectComposition.an = new int[]{50049};
                break;
            case 10636:
                objectComposition.an = new int[]{50049};
                break;
            case 10637:
                objectComposition.an = new int[]{50049};
                break;
            case 10850:
                objectComposition.an = new int[]{50049};
                break;
            case 11133:
                objectComposition.an = new int[]{50037};
                break;
            case 11147:
                objectComposition.an = new int[]{50037};
                break;
            case 11630:
                objectComposition.an = new int[]{50074};
                break;
            case 11631:
                objectComposition.an = new int[]{50074};
                break;
            case 11632:
                objectComposition.an = new int[]{50074};
                break;
            case 11971:
                objectComposition.an = new int[]{50037};
                break;
            case 12185:
                objectComposition.an = new int[]{50037};
                break;
            case 12187:
                objectComposition.an = new int[]{50037};
                break;
            case 12189:
                objectComposition.an = new int[]{50037};
                break;
            case 12455:
                objectComposition.an = new int[]{50037};
                break;
            case 12457:
                objectComposition.an = new int[]{50037};
                break;
            case 12459:
                objectComposition.an = new int[]{50037};
                break;
            case GLXEXTContextPriority.GLX_CONTEXT_PRIORITY_MEDIUM_EXT /* 12546 */:
                objectComposition.an = new int[]{50091};
                break;
            case 12961:
                objectComposition.an = new int[]{50091};
                break;
            case 12977:
                objectComposition.an = new int[]{50091};
                break;
            case aU.TX /* 14108 */:
                objectComposition.an = new int[]{50049};
                break;
            case 14399:
                objectComposition.an = new int[]{50074};
                break;
            case 14403:
                objectComposition.an = new int[]{50074};
                break;
            case 14404:
                objectComposition.an = new int[]{50074};
                break;
            case 14411:
                objectComposition.an = new int[]{50074};
                break;
            case 14413:
                objectComposition.an = new int[]{50074};
                break;
            case 14414:
                objectComposition.an = new int[]{50074};
                break;
            case 14832:
                objectComposition.an = new int[]{50074};
                break;
            case 14833:
                objectComposition.an = new int[]{50074};
                break;
            case 14834:
                objectComposition.an = new int[]{50074};
                break;
            case 14835:
                objectComposition.an = new int[]{50074};
                break;
            case 14836:
                objectComposition.an = new int[]{50074};
                break;
            case 14841:
                objectComposition.an = new int[]{50074};
                break;
            case 14844:
                objectComposition.an = new int[]{50074};
                break;
            case 14845:
                objectComposition.an = new int[]{50074};
                break;
            case 14846:
                objectComposition.an = new int[]{50074};
                break;
            case 14847:
                objectComposition.an = new int[]{50074};
                break;
            case 14848:
                objectComposition.an = new int[]{50074};
                break;
            case 14882:
                objectComposition.an = new int[]{50049};
                break;
            case 14897:
                objectComposition.an = new int[]{50074};
                break;
            case 14901:
                objectComposition.an = new int[]{50074};
                break;
            case 14903:
                objectComposition.an = new int[]{50074};
                break;
            case 14904:
                objectComposition.an = new int[]{50074};
                break;
            case 14919:
                objectComposition.an = new int[]{50074};
                break;
            case 14920:
                objectComposition.an = new int[]{50074};
                break;
            case 14921:
                objectComposition.an = new int[]{50074};
                break;
            case 14922:
                objectComposition.an = new int[]{50074};
                break;
            case 14923:
                objectComposition.an = new int[]{50074};
                break;
            case 14924:
                objectComposition.an = new int[]{50074};
                break;
            case 14925:
                objectComposition.an = new int[]{50074};
                break;
            case 14928:
                objectComposition.an = new int[]{50074};
                break;
            case 14929:
                objectComposition.an = new int[]{50074};
                break;
            case 14930:
                objectComposition.an = new int[]{50074};
                break;
            case 14931:
                objectComposition.an = new int[]{50074};
                break;
            case 14936:
                objectComposition.an = new int[]{50074};
                break;
            case 14937:
                objectComposition.an = new int[]{50074};
                break;
            case 14938:
                objectComposition.an = new int[]{50074};
                break;
            case 14939:
                objectComposition.an = new int[]{50074};
                break;
            case 14941:
                objectComposition.an = new int[]{50074};
                break;
            case 14945:
                objectComposition.an = new int[]{50074};
                break;
            case 14947:
                objectComposition.an = new int[]{50074};
                break;
            case 14987:
                objectComposition.an = new int[]{50074};
                break;
            case 14990:
                objectComposition.an = new int[]{50074};
                break;
            case 14991:
                objectComposition.an = new int[]{50074};
                break;
            case 14992:
                objectComposition.an = new int[]{50074};
                break;
            case 14994:
                objectComposition.an = new int[]{50074};
                break;
            case aU.Uv /* 15022 */:
                objectComposition.an = new int[]{50037};
                break;
            case aU.UB /* 15028 */:
                objectComposition.an = new int[]{50037};
                break;
            case aU.UD /* 15030 */:
                objectComposition.an = new int[]{50091};
                break;
            case 15173:
                objectComposition.an = new int[]{50037};
                break;
            case 15179:
                objectComposition.an = new int[]{50037};
                break;
            case 15283:
                objectComposition.an = new int[]{50116, 50009, 50075, 50118, 50074};
                break;
            case 15284:
                objectComposition.an = new int[]{50116, 50009, 50075, 50118, 50074};
                break;
            case 15285:
                objectComposition.an = new int[]{50116, 50009, 50075, 50118, 50074};
                break;
            case 15520:
                objectComposition.an = new int[]{50049};
                break;
            case 15525:
                objectComposition.an = new int[]{50037};
                break;
            case 15531:
                objectComposition.an = new int[]{50049};
                break;
            case 15532:
                objectComposition.an = new int[]{50049};
                break;
            case 15533:
                objectComposition.an = new int[]{50049};
                break;
            case 15534:
                objectComposition.an = new int[]{50049};
                break;
            case 15608:
                objectComposition.an = new int[]{50116, 50009, 50075, 50118, 50074};
                break;
            case 15609:
                objectComposition.an = new int[]{50074};
                break;
            case 15610:
                objectComposition.an = new int[]{50074};
                break;
            case 15611:
                objectComposition.an = new int[]{50074};
                break;
            case 15612:
                objectComposition.an = new int[]{50074};
                break;
            case 15745:
                objectComposition.an = new int[]{50037};
                break;
            case 15804:
                objectComposition.an = new int[]{50037};
                break;
            case 16102:
                objectComposition.an = new int[]{50037};
                break;
            case 16193:
                objectComposition.an = new int[]{50037};
                break;
            case 16210:
                objectComposition.an = new int[]{50037};
                break;
            case 16297:
                objectComposition.an = new int[]{50037};
                break;
            case 16319:
                objectComposition.an = new int[]{50037};
                break;
            case 16322:
                objectComposition.an = new int[]{50037};
                break;
            case 16388:
                objectComposition.an = new int[]{50049};
                break;
            case 16389:
                objectComposition.an = new int[]{50049};
                break;
            case 16390:
                objectComposition.an = new int[]{50049};
                break;
            case 16391:
                objectComposition.an = new int[]{50049};
                break;
            case m.aV /* 16392 */:
                objectComposition.an = new int[]{50049};
                break;
            case m.aW /* 16393 */:
                objectComposition.an = new int[]{50049};
                break;
            case m.aX /* 16394 */:
                objectComposition.an = new int[]{50049};
                break;
            case m.aY /* 16395 */:
                objectComposition.an = new int[]{50049};
                break;
            case m.aZ /* 16396 */:
                objectComposition.an = new int[]{50049};
                break;
            case m.ba /* 16397 */:
                objectComposition.an = new int[]{50049};
                break;
            case m.bb /* 16398 */:
                objectComposition.an = new int[]{50049};
                break;
            case m.bc /* 16399 */:
                objectComposition.an = new int[]{50049};
                break;
            case 16400:
                objectComposition.an = new int[]{50049};
                break;
            case 16401:
                objectComposition.an = new int[]{50049};
                break;
            case 16402:
                objectComposition.an = new int[]{50049};
                break;
            case 16403:
                objectComposition.an = new int[]{50049};
                break;
            case 16404:
                objectComposition.an = new int[]{50049};
                break;
            case 16405:
                objectComposition.an = new int[]{50049};
                break;
            case 16406:
                objectComposition.an = new int[]{50049};
                break;
            case 16407:
                objectComposition.an = new int[]{50049};
                break;
            case 16408:
                objectComposition.an = new int[]{50049};
                break;
            case 16409:
                objectComposition.an = new int[]{50049};
                break;
            case 16410:
                objectComposition.an = new int[]{50049};
                break;
            case 16411:
                objectComposition.an = new int[]{50049};
                break;
            case 16412:
                objectComposition.an = new int[]{50049};
                break;
            case 16413:
                objectComposition.an = new int[]{50049};
                break;
            case 16414:
                objectComposition.an = new int[]{50049};
                break;
            case 16415:
                objectComposition.an = new int[]{50049};
                break;
            case 16416:
                objectComposition.an = new int[]{50049};
                break;
            case 16417:
                objectComposition.an = new int[]{50049};
                break;
            case 16418:
                objectComposition.an = new int[]{50049};
                break;
            case 16419:
                objectComposition.an = new int[]{50049};
                break;
            case 16420:
                objectComposition.an = new int[]{50049};
                break;
            case 16421:
                objectComposition.an = new int[]{50049};
                break;
            case 16422:
                objectComposition.an = new int[]{50049};
                break;
            case 16423:
                objectComposition.an = new int[]{50049};
                break;
            case 16424:
                objectComposition.an = new int[]{50049};
                break;
            case 16425:
                objectComposition.an = new int[]{50049};
                break;
            case 16426:
                objectComposition.an = new int[]{50049};
                break;
            case 16427:
                objectComposition.an = new int[]{50049};
                break;
            case 16428:
                objectComposition.an = new int[]{50049};
                break;
            case 16429:
                objectComposition.an = new int[]{50049};
                break;
            case 16430:
                objectComposition.an = new int[]{50049};
                break;
            case 16431:
                objectComposition.an = new int[]{50049};
                break;
            case AMDDeviceAttributeQuery.CL_DEVICE_PREFERRED_WORK_GROUP_SIZE_AMD /* 16432 */:
                objectComposition.an = new int[]{50049};
                break;
            case 16433:
                objectComposition.an = new int[]{50049};
                break;
            case 16434:
                objectComposition.an = new int[]{50049};
                break;
            case 16435:
                objectComposition.an = new int[]{50049};
                break;
            case 16436:
                objectComposition.an = new int[]{50049};
                break;
            case 16437:
                objectComposition.an = new int[]{50049};
                break;
            case 16438:
                objectComposition.an = new int[]{50049};
                break;
            case 16439:
                objectComposition.an = new int[]{50049};
                break;
            case 16440:
                objectComposition.an = new int[]{50049};
                break;
            case AMDDeviceAttributeQuery.CL_DEVICE_GLOBAL_FREE_MEMORY_AMD /* 16441 */:
                objectComposition.an = new int[]{50049};
                break;
            case 16442:
                objectComposition.an = new int[]{50049};
                break;
            case 16443:
                objectComposition.an = new int[]{50049};
                break;
            case 16444:
                objectComposition.an = new int[]{50049};
                break;
            case 16445:
                objectComposition.an = new int[]{50049};
                break;
            case 16446:
                objectComposition.an = new int[]{50049};
                break;
            case AMDOfflineDevices.CL_CONTEXT_OFFLINE_DEVICES_AMD /* 16447 */:
                objectComposition.an = new int[]{50049};
                break;
            case 16448:
                objectComposition.an = new int[]{50049};
                break;
            case AMDDeviceAttributeQuery.CL_DEVICE_SIMD_WIDTH_AMD /* 16449 */:
                objectComposition.an = new int[]{50049};
                break;
            case AMDDeviceAttributeQuery.CL_DEVICE_WAVEFRONT_WIDTH_AMD /* 16451 */:
                objectComposition.an = new int[]{50049};
                break;
            case AMDDeviceAttributeQuery.CL_DEVICE_GLOBAL_MEM_CHANNELS_AMD /* 16452 */:
                objectComposition.an = new int[]{50049};
                break;
            case AMDDeviceAttributeQuery.CL_DEVICE_GLOBAL_MEM_CHANNEL_BANKS_AMD /* 16453 */:
                objectComposition.an = new int[]{50049};
                break;
            case AMDDeviceAttributeQuery.CL_DEVICE_GLOBAL_MEM_CHANNEL_BANK_WIDTH_AMD /* 16454 */:
                objectComposition.an = new int[]{50049};
                break;
            case AMDDeviceAttributeQuery.CL_DEVICE_LOCAL_MEM_SIZE_PER_COMPUTE_UNIT_AMD /* 16455 */:
                objectComposition.an = new int[]{50049};
                break;
            case AMDDeviceAttributeQuery.CL_DEVICE_LOCAL_MEM_BANKS_AMD /* 16456 */:
                objectComposition.an = new int[]{50049};
                break;
            case AMDDeviceAttributeQuery.CL_DEVICE_THREAD_TRACE_SUPPORTED_AMD /* 16457 */:
                objectComposition.an = new int[]{50049};
                break;
            case AMDDeviceAttributeQuery.CL_DEVICE_GFXIP_MAJOR_AMD /* 16458 */:
                objectComposition.an = new int[]{50049};
                break;
            case AMDDeviceAttributeQuery.CL_DEVICE_GFXIP_MINOR_AMD /* 16459 */:
                objectComposition.an = new int[]{50049};
                break;
            case AMDDeviceAttributeQuery.CL_DEVICE_AVAILABLE_ASYNC_QUEUES_AMD /* 16460 */:
                objectComposition.an = new int[]{50049};
                break;
            case 16461:
                objectComposition.an = new int[]{50049};
                break;
            case 16462:
                objectComposition.an = new int[]{50049};
                break;
            case 16463:
                objectComposition.an = new int[]{50049};
                break;
            case QCOMEXTHostPtrIOCoherent.CL_MEM_HOST_IOCOHERENT_QCOM /* 16553 */:
                objectComposition.an = new int[]{50049};
                break;
            case 16554:
                objectComposition.an = new int[]{50049};
                break;
            case 16555:
                objectComposition.an = new int[]{50049};
                break;
            case 17030:
                objectComposition.an = new int[]{50049};
                break;
            case 17033:
                objectComposition.an = new int[]{50091, 16886};
                break;
            case 17224:
                objectComposition.an = new int[]{50037};
                break;
            case 17330:
                objectComposition.an = new int[]{50037};
                break;
            case 17332:
                objectComposition.an = new int[]{50037};
                break;
            case 17410:
                objectComposition.an = new int[]{50049};
                break;
            case 17411:
                objectComposition.an = new int[]{50049};
                break;
            case 17412:
                objectComposition.an = new int[]{50049};
                break;
            case 17413:
                objectComposition.an = new int[]{50049};
                break;
            case 17414:
                objectComposition.an = new int[]{50049};
                break;
            case 17415:
                objectComposition.an = new int[]{50049};
                break;
            case 17416:
                objectComposition.an = new int[]{50049};
                break;
            case 17417:
                objectComposition.an = new int[]{50049};
                break;
            case 17418:
                objectComposition.an = new int[]{50049};
                break;
            case 17419:
                objectComposition.an = new int[]{50049};
                break;
            case 17420:
                objectComposition.an = new int[]{50049};
                break;
            case 17421:
                objectComposition.an = new int[]{50049};
                break;
            case 17664:
                objectComposition.an = new int[]{50037};
                break;
            case 17861:
                objectComposition.an = new int[]{50037};
                break;
            case 17871:
                objectComposition.an = new int[]{50037};
                break;
            case 17902:
                objectComposition.an = new int[]{50037};
                break;
            case 18138:
                objectComposition.an = new int[]{50049};
                break;
            case 18405:
                objectComposition.an = new int[]{50049};
                break;
            case 18406:
                objectComposition.an = new int[]{50049};
                break;
            case 18407:
                objectComposition.an = new int[]{50049};
                break;
            case 18408:
                objectComposition.an = new int[]{50049};
                break;
            case 18409:
                objectComposition.an = new int[]{50049};
                break;
            case 18410:
                objectComposition.an = new int[]{50049};
                break;
            case 18471:
                objectComposition.an = new int[]{50037};
                break;
            case 18688:
                objectComposition.an = new int[]{50049};
                break;
            case 18889:
                objectComposition.an = new int[]{50091};
                break;
            case 19694:
                objectComposition.an = new int[]{50037};
                break;
            case 19697:
                objectComposition.an = new int[]{50037};
                break;
            case 19750:
                objectComposition.an = new int[]{50049};
                break;
            case 19751:
                objectComposition.an = new int[]{50049};
                break;
            case 19756:
                objectComposition.an = new int[]{50037};
                break;
            case 19794:
                objectComposition.an = new int[]{50037};
                break;
            case 19861:
                objectComposition.an = new int[]{50037};
                break;
            case 20086:
                objectComposition.an = new int[]{50049};
                break;
            case 20132:
                objectComposition.an = new int[]{50049};
                break;
            case 20153:
                objectComposition.an = new int[]{50037};
                break;
            case 20156:
                objectComposition.an = new int[]{50037};
                break;
            case 20222:
                objectComposition.an = new int[]{50037};
                break;
            case 20258:
                objectComposition.an = new int[]{50037};
                break;
            case 20268:
                objectComposition.an = new int[]{50049};
                break;
            case 20269:
                objectComposition.an = new int[]{50116, 50009, 50075, 50118, 50074};
                break;
            case 20291:
                objectComposition.an = new int[]{50037};
                break;
            case 20367:
                objectComposition.an = new int[]{50091};
                break;
            case 20737:
                objectComposition.an = new int[]{50037};
                break;
            case 20980:
                objectComposition.an = new int[]{50116, 50009, 50075, 50118, 50074};
                break;
            case 20984:
                objectComposition.an = new int[]{50049};
                break;
            case 20989:
                objectComposition.an = new int[]{50049};
                break;
            case 20994:
                objectComposition.an = new int[]{50067};
                break;
            case 21087:
                objectComposition.an = new int[]{50049};
                break;
            case 21099:
                objectComposition.an = new int[]{50076};
                break;
            case 21100:
                objectComposition.an = new int[]{50076};
                break;
            case 21101:
                objectComposition.an = new int[]{50076};
                break;
            case 21103:
                objectComposition.an = new int[]{50043};
                break;
            case 21104:
                objectComposition.an = new int[]{50056};
                break;
            case 21105:
                objectComposition.an = new int[]{50067};
                break;
            case 21110:
                objectComposition.an = new int[]{50076};
                break;
            case 21111:
                objectComposition.an = new int[]{50076};
                break;
            case 21125:
                objectComposition.an = new int[]{50076};
                break;
            case 21126:
                objectComposition.an = new int[]{50076};
                break;
            case 21127:
                objectComposition.an = new int[]{50076};
                break;
            case 21128:
                objectComposition.an = new int[]{50076};
                break;
            case 21129:
                objectComposition.an = new int[]{50076};
                break;
            case 21130:
                objectComposition.an = new int[]{50076};
                break;
            case 21131:
                objectComposition.an = new int[]{50076};
                break;
            case 21132:
                objectComposition.an = new int[]{50076};
                break;
            case 21133:
                objectComposition.an = new int[]{50076};
                break;
            case 21174:
                objectComposition.an = new int[]{50049};
                break;
            case 21227:
                objectComposition.an = new int[]{50076};
                break;
            case 21228:
                objectComposition.an = new int[]{50076};
                break;
            case 21229:
                objectComposition.an = new int[]{50076};
                break;
            case 21230:
                objectComposition.an = new int[]{50076};
                break;
            case 21232:
                objectComposition.an = new int[]{50076};
                break;
            case 21234:
                objectComposition.an = new int[]{50076};
                break;
            case 21236:
                objectComposition.an = new int[]{50076};
                break;
            case 21238:
                objectComposition.an = new int[]{50076};
                break;
            case 21490:
                objectComposition.an = new int[]{50037};
                break;
            case 21491:
                objectComposition.an = new int[]{50037};
                break;
            case 21540:
                objectComposition.an = new int[]{50037};
                break;
            case 21542:
                objectComposition.an = new int[]{50037};
                break;
            case 21655:
                objectComposition.an = new int[]{50049};
                break;
            case 21804:
                objectComposition.an = new int[]{50049};
                break;
            case 21805:
                objectComposition.an = new int[]{50049};
                break;
            case 21806:
                objectComposition.an = new int[]{50049};
                break;
            case 21807:
                objectComposition.an = new int[]{50049};
                break;
            case 21808:
                objectComposition.an = new int[]{50049};
                break;
            case 21948:
                objectComposition.an = new int[]{50049};
                break;
            case 21949:
                objectComposition.an = new int[]{50049};
                break;
            case 22170:
                objectComposition.an = new int[]{50037};
                break;
            case 22363:
                objectComposition.an = new int[]{50037};
                break;
            case 22426:
                objectComposition.an = new int[]{50091};
                break;
            case 22861:
                objectComposition.an = new int[]{50049};
                break;
            case 23075:
                objectComposition.an = new int[]{50037};
                break;
            case 23078:
                objectComposition.an = new int[]{50037};
                break;
            case 23198:
                objectComposition.an = new int[]{50037};
                break;
            case 23541:
                objectComposition.an = new int[]{50049};
                break;
            case 23578:
                objectComposition.an = new int[]{50037};
                break;
            case 23590:
                objectComposition.an = new int[]{50049};
                break;
            case 23597:
                objectComposition.an = new int[]{50037};
                break;
            case 23612:
                objectComposition.an = new int[]{50049};
                break;
            case 23930:
                objectComposition.an = new int[]{50037};
                break;
            case 24450:
                objectComposition.an = new int[]{50049};
                break;
            case 24451:
                objectComposition.an = new int[]{50049};
                break;
            case 24690:
                objectComposition.an = new int[]{50091};
                break;
            case 24713:
                objectComposition.an = new int[]{50049};
                break;
            case 24714:
                objectComposition.an = new int[]{50049};
                break;
            case 24715:
                objectComposition.an = new int[]{50049};
                break;
            case 24720:
                objectComposition.an = new int[]{50116, 50009, 50075, 50118, 50074};
                break;
            case 24981:
                objectComposition.an = new int[]{50037};
                break;
            case 24983:
                objectComposition.an = new int[]{50037};
                break;
            case 25057:
                objectComposition.an = new int[]{50037};
                break;
            case 25287:
                objectComposition.an = new int[]{50116};
                break;
            case 25414:
                objectComposition.an = new int[]{50037};
                break;
            case 25636:
                objectComposition.an = new int[]{50116, 50009, 50075, 50118, 50074};
                break;
            case 25840:
                objectComposition.an = new int[]{50037};
                break;
            case 26154:
                objectComposition.an = new int[]{50037};
                break;
            case 26301:
                objectComposition.an = new int[]{50049};
                break;
            case 26302:
                objectComposition.an = new int[]{50049};
                break;
            case 26303:
                objectComposition.an = new int[]{50049};
                break;
            case 26304:
                objectComposition.an = new int[]{50049};
                break;
            case 26305:
                objectComposition.an = new int[]{50049};
                break;
            case 26306:
                objectComposition.an = new int[]{50002};
                break;
            case 26307:
                objectComposition.an = new int[]{50025};
                break;
            case 26308:
                objectComposition.an = new int[]{50147};
                break;
            case 26309:
                objectComposition.an = new int[]{50024};
                break;
            case 26310:
                objectComposition.an = new int[]{50149};
                break;
            case 26311:
                objectComposition.an = new int[]{50013};
                break;
            case 26312:
                objectComposition.an = new int[]{50007};
                break;
            case 26313:
                objectComposition.an = new int[]{50027};
                break;
            case 26314:
                objectComposition.an = new int[]{50001};
                break;
            case 26315:
                objectComposition.an = new int[]{50008};
                break;
            case 26316:
                objectComposition.an = new int[]{50145};
                break;
            case 26317:
                objectComposition.an = new int[]{50010};
                break;
            case 26318:
                objectComposition.an = new int[]{50142};
                break;
            case 26319:
                objectComposition.an = new int[]{50004};
                break;
            case 26320:
                objectComposition.an = new int[]{50144};
                break;
            case 26324:
                objectComposition.an = new int[]{50140};
                break;
            case 26325:
                objectComposition.an = new int[]{50028};
                break;
            case 26326:
                objectComposition.an = new int[]{50003};
                break;
            case 26327:
                objectComposition.an = new int[]{50017};
                break;
            case 26328:
                objectComposition.an = new int[]{50026};
                break;
            case 26329:
                objectComposition.an = new int[]{50015};
                break;
            case 26330:
                objectComposition.an = new int[]{50000};
                break;
            case 26331:
                objectComposition.an = new int[]{50006};
                break;
            case 26332:
                objectComposition.an = new int[]{50016};
                break;
            case 26333:
                objectComposition.an = new int[]{50011};
                break;
            case 26334:
                objectComposition.an = new int[]{50146};
                break;
            case 26335:
                objectComposition.an = new int[]{50014};
                break;
            case 26336:
                objectComposition.an = new int[]{50031};
                break;
            case 26337:
                objectComposition.an = new int[]{50005};
                break;
            case 26338:
                objectComposition.an = new int[]{50150};
                break;
            case 26339:
                objectComposition.an = new int[]{50029};
                break;
            case 26340:
                objectComposition.an = new int[]{50148};
                break;
            case 26341:
                objectComposition.an = new int[]{50023};
                break;
            case 26342:
                objectComposition.an = new int[]{50022};
                break;
            case 26343:
                objectComposition.an = new int[]{50141};
                break;
            case 26344:
                objectComposition.an = new int[]{50030};
                break;
            case 26345:
                objectComposition.an = new int[]{50012};
                break;
            case 26346:
                objectComposition.an = new int[]{50143};
                break;
            case 26347:
                objectComposition.an = new int[]{50020};
                break;
            case 26348:
                objectComposition.an = new int[]{50113, 50106};
                break;
            case 26349:
                objectComposition.an = new int[]{50108, 50105};
                break;
            case 26350:
                objectComposition.an = new int[]{50097, 50114};
                break;
            case 26351:
                objectComposition.an = new int[]{50100, 50098};
                break;
            case 26352:
                objectComposition.an = new int[]{50110};
                break;
            case 26353:
                objectComposition.an = new int[]{50096};
                break;
            case 26354:
                objectComposition.an = new int[]{50112, 27791};
                break;
            case 26355:
                objectComposition.an = new int[]{50111};
                break;
            case 26356:
                objectComposition.an = new int[]{50109};
                break;
            case 26357:
                objectComposition.an = new int[]{50095};
                break;
            case 26358:
                objectComposition.an = new int[]{50101};
                break;
            case 26359:
                objectComposition.an = new int[]{50102, 50099};
                break;
            case 26360:
                objectComposition.an = new int[]{50103};
                break;
            case 26361:
                objectComposition.an = new int[]{50107};
                break;
            case 26362:
                objectComposition.an = new int[]{50104};
                break;
            case 26364:
                objectComposition.an = new int[]{50085};
                break;
            case 26365:
                objectComposition.an = new int[]{50084, 50065};
                break;
            case 26366:
                objectComposition.an = new int[]{50160};
                break;
            case 26367:
                objectComposition.an = new int[]{50066};
                break;
            case 26368:
                objectComposition.an = new int[]{50094};
                break;
            case 26370:
                objectComposition.an = new int[]{50124};
                break;
            case 26374:
                objectComposition.an = new int[]{50124};
                break;
            case 26378:
                objectComposition.an = new int[]{50124};
                break;
            case 26379:
                objectComposition.an = new int[]{50021};
                break;
            case 26380:
                objectComposition.an = new int[]{50018};
                break;
            case 26381:
                objectComposition.an = new int[]{50019};
                break;
            case 26384:
                objectComposition.an = new int[]{50119};
                break;
            case 26385:
                objectComposition.an = new int[]{50117};
                break;
            case 26387:
                objectComposition.an = new int[]{50115};
                break;
            case 26392:
                objectComposition.an = new int[]{50122};
                break;
            case 26393:
                objectComposition.an = new int[]{50123};
                break;
            case 26396:
                objectComposition.an = new int[]{50043};
                break;
            case 26397:
                objectComposition.an = new int[]{50056};
                break;
            case 26398:
                objectComposition.an = new int[]{50067};
                break;
            case 26399:
                objectComposition.an = new int[]{50120};
                break;
            case 26414:
                objectComposition.an = new int[]{50121};
                break;
            case 26418:
                objectComposition.an = new int[]{50151};
                break;
            case 26422:
                objectComposition.an = new int[]{50125};
                break;
            case 26423:
                objectComposition.an = new int[]{50059, 50050, 27709};
                break;
            case 26424:
                objectComposition.an = new int[]{50040};
                break;
            case 26426:
                objectComposition.an = new int[]{50064};
                break;
            case 26427:
                objectComposition.an = new int[]{27719, 50063, 50046};
                break;
            case 26429:
                objectComposition.an = new int[]{50039};
                break;
            case 26430:
                objectComposition.an = new int[]{50062};
                break;
            case 26431:
                objectComposition.an = new int[]{50047};
                break;
            case 26435:
                objectComposition.an = new int[]{50045, 50051, 50042};
                break;
            case 26436:
                objectComposition.an = new int[]{50058};
                break;
            case 26440:
                objectComposition.an = new int[]{50034, 50061};
                break;
            case 26441:
                objectComposition.an = new int[]{50055};
                break;
            case 26442:
                objectComposition.an = new int[]{50131};
                break;
            case 26443:
                objectComposition.an = new int[]{50131};
                break;
            case 26444:
                objectComposition.an = new int[]{50130};
                break;
            case 26445:
                objectComposition.an = new int[]{50135};
                break;
            case 26446:
                objectComposition.an = new int[]{50135};
                break;
            case 26447:
                objectComposition.an = new int[]{50133};
                break;
            case 26448:
                objectComposition.an = new int[]{50138};
                break;
            case 26449:
                objectComposition.an = new int[]{50138};
                break;
            case 26450:
                objectComposition.an = new int[]{50132};
                break;
            case 26451:
                objectComposition.an = new int[]{50136};
                break;
            case 26452:
                objectComposition.an = new int[]{50136};
                break;
            case 26453:
                objectComposition.an = new int[]{50134};
                break;
            case 26454:
                objectComposition.an = new int[]{50139};
                break;
            case 26455:
                objectComposition.an = new int[]{50139};
                break;
            case 26456:
                objectComposition.an = new int[]{50137};
                break;
            case 26457:
                objectComposition.an = new int[]{50054};
                break;
            case 26458:
                objectComposition.an = new int[]{50041};
                break;
            case 26463:
                objectComposition.an = new int[]{50057};
                break;
            case 26464:
                objectComposition.an = new int[]{50057};
                break;
            case 26465:
                objectComposition.an = new int[]{50044};
                break;
            case 26466:
                objectComposition.an = new int[]{50044};
                break;
            case 26467:
                objectComposition.an = new int[]{50053};
                break;
            case 26468:
                objectComposition.an = new int[]{50053};
                break;
            case 26469:
                objectComposition.an = new int[]{27760, 50086};
                break;
            case 26471:
                objectComposition.an = new int[]{50083};
                break;
            case 26472:
                objectComposition.an = new int[]{50077};
                break;
            case 26473:
                objectComposition.an = new int[]{50088};
                break;
            case 26474:
                objectComposition.an = new int[]{50070};
                break;
            case 26475:
                objectComposition.an = new int[]{50078};
                break;
            case 26476:
                objectComposition.an = new int[]{50068};
                break;
            case 26477:
                objectComposition.an = new int[]{50080};
                break;
            case 26478:
                objectComposition.an = new int[]{50082};
                break;
            case 26480:
                objectComposition.an = new int[]{50087};
                break;
            case 26481:
                objectComposition.an = new int[]{50079};
                break;
            case 26482:
                objectComposition.an = new int[]{50073};
                break;
            case 26483:
                objectComposition.an = new int[]{50069};
                break;
            case 26484:
                objectComposition.an = new int[]{50071};
                break;
            case 26485:
                objectComposition.an = new int[]{50081};
                break;
            case 26486:
                objectComposition.an = new int[]{50072};
                break;
            case 26487:
                objectComposition.an = new int[]{50126};
                break;
            case 26488:
                objectComposition.an = new int[]{50128};
                break;
            case 26489:
                objectComposition.an = new int[]{50127};
                break;
            case 26490:
                objectComposition.an = new int[]{50129};
                break;
            case 26491:
                objectComposition.an = new int[]{50033};
                break;
            case 26493:
                objectComposition.an = new int[]{50060};
                break;
            case 26494:
                objectComposition.an = new int[]{50032};
                break;
            case 26497:
                objectComposition.an = new int[]{50090};
                break;
            case 26499:
                objectComposition.an = new int[]{50089};
                break;
            case 26500:
                objectComposition.an = new int[]{50038};
                break;
            case 26501:
                objectComposition.an = new int[]{50038};
                break;
            case 26502:
            case 26503:
            case 26504:
            case 26505:
                objectComposition.a();
                objectComposition.a(ObjectComposition.c(40419));
                break;
            case 26508:
                objectComposition.an = new int[]{50035};
                break;
            case 26509:
                objectComposition.an = new int[]{50035};
                break;
            case 26510:
                objectComposition.an = new int[]{50052};
                break;
            case 26511:
                objectComposition.an = new int[]{50052};
                break;
            case 26514:
                objectComposition.an = new int[]{50048};
                break;
            case 26515:
                objectComposition.an = new int[]{50048};
                break;
            case 26516:
                objectComposition.an = new int[]{50036};
                break;
            case 26517:
                objectComposition.an = new int[]{50036};
                break;
            case 26518:
                objectComposition.an = new int[]{50076};
                break;
            case 26519:
                objectComposition.an = new int[]{50091};
                break;
            case 26657:
                objectComposition.an = new int[]{50037};
                break;
            case 26677:
                objectComposition.an = new int[]{50116, 50009, 50075, 50118, 50074};
                break;
            case 26678:
                objectComposition.an = new int[]{50116, 50009, 50075, 50118, 50074};
                break;
            case 26710:
                objectComposition.an = new int[]{50049};
                break;
            case 26821:
                objectComposition.an = new int[]{50049};
                break;
            case 27119:
                objectComposition.an = new int[]{50049};
                break;
            case 27120:
                objectComposition.an = new int[]{50049};
                break;
            case 27122:
                objectComposition.an = new int[]{50116, 50009, 50075, 50118, 50074};
                break;
            case 27437:
                objectComposition.an = new int[]{50074};
                break;
            case 27438:
                objectComposition.an = new int[]{50074};
                break;
            case 28592:
                objectComposition.an = new int[]{50116, 50009, 50075, 50118, 50074};
                break;
            case 28753:
                objectComposition.an = new int[]{50116, 50009, 50075, 50118, 50074};
                break;
            case 28759:
                objectComposition.an = new int[]{50116, 50009, 50075, 50118, 50074};
                break;
            case 28765:
                objectComposition.an = new int[]{50116, 50009, 50075, 50118, 50074};
                break;
            case 28913:
                objectComposition.an = new int[]{50074};
                break;
            case 29081:
                objectComposition.an = new int[]{50091};
                break;
            case 29326:
                objectComposition.an = new int[]{50074};
                break;
            case 29994:
                objectComposition.an = new int[]{50049};
                break;
            case 30023:
                objectComposition.an = new int[]{50074};
                break;
            case 30143:
                objectComposition.an = new int[]{50074};
                break;
            case 30144:
                objectComposition.an = new int[]{50074};
                break;
            case 31693:
                objectComposition.an = new int[]{50124};
                break;
            case 31694:
                objectComposition.an = new int[]{50125};
                break;
            case 31776:
                objectComposition.an = new int[]{50037};
                break;
            case 31967:
                objectComposition.an = new int[]{50124};
                break;
            case 31968:
                objectComposition.an = new int[]{50125};
                break;
            case class_463.bT /* 32312 */:
                objectComposition.an = new int[]{50074};
                break;
            case class_463.bU /* 32313 */:
                objectComposition.an = new int[]{50074};
                break;
            case class_463.bV /* 32314 */:
                objectComposition.an = new int[]{50074};
                break;
            case 32320:
                objectComposition.an = new int[]{50074};
                break;
            case 33111:
                objectComposition.an = new int[]{50074};
                break;
            case 33150:
                objectComposition.an = new int[]{50049};
                break;
            case 33151:
                objectComposition.an = new int[]{50049};
                break;
            case GLXINTELSwapEvent.GLX_EXCHANGE_COMPLETE_INTEL /* 33152 */:
                objectComposition.an = new int[]{50049};
                break;
            case GLXINTELSwapEvent.GLX_COPY_COMPLETE_INTEL /* 33153 */:
                objectComposition.an = new int[]{50049};
                break;
            case GLXINTELSwapEvent.GLX_FLIP_COMPLETE_INTEL /* 33154 */:
                objectComposition.an = new int[]{50049};
                break;
            case 33155:
                objectComposition.an = new int[]{50049};
                break;
            case 33156:
                objectComposition.an = new int[]{50049};
                break;
            case 33157:
                objectComposition.an = new int[]{50049};
                break;
            case 33158:
                objectComposition.an = new int[]{50049};
                break;
            case 33159:
                objectComposition.an = new int[]{50049};
                break;
            case 33160:
                objectComposition.an = new int[]{50049};
                break;
            case 33161:
                objectComposition.an = new int[]{50049};
                break;
            case 33162:
                objectComposition.an = new int[]{50049};
                break;
            case 33163:
                objectComposition.an = new int[]{50049};
                break;
            case 33164:
                objectComposition.an = new int[]{50049};
                break;
            case 33165:
                objectComposition.an = new int[]{50049};
                break;
            case 33166:
                objectComposition.an = new int[]{50049};
                break;
            case 33167:
                objectComposition.an = new int[]{50049};
                break;
            case 33168:
                objectComposition.an = new int[]{50049};
                break;
            case GL14.GL_GENERATE_MIPMAP /* 33169 */:
                objectComposition.an = new int[]{50049};
                break;
            case GL14.GL_GENERATE_MIPMAP_HINT /* 33170 */:
                objectComposition.an = new int[]{50049};
                break;
            case 33171:
                objectComposition.an = new int[]{50049};
                break;
            case 33172:
                objectComposition.an = new int[]{50049};
                break;
            case 33173:
                objectComposition.an = new int[]{50049};
                break;
            case 33174:
                objectComposition.an = new int[]{50049};
                break;
            case 33175:
                objectComposition.an = new int[]{50049};
                break;
            case 33189:
                objectComposition.an = new int[]{50074};
                break;
            case 33615:
                objectComposition.an = new int[]{50049};
                break;
            case 33616:
                objectComposition.an = new int[]{50049};
                break;
            case 33617:
                objectComposition.an = new int[]{50049};
                break;
            case 33618:
                objectComposition.an = new int[]{50049};
                break;
            case 33619:
                objectComposition.an = new int[]{50049};
                break;
            case 33620:
                objectComposition.an = new int[]{50049};
                break;
            case 33621:
                objectComposition.an = new int[]{50049};
                break;
            case 33622:
                objectComposition.an = new int[]{50049};
                break;
            case 33623:
                objectComposition.an = new int[]{50049};
                break;
            case 33624:
                objectComposition.an = new int[]{50049};
                break;
            case 33625:
                objectComposition.an = new int[]{50049};
                break;
            case 33626:
                objectComposition.an = new int[]{50049};
                break;
            case 33627:
                objectComposition.an = new int[]{50049};
                break;
            case 33628:
                objectComposition.an = new int[]{50049};
                break;
            case 33629:
                objectComposition.an = new int[]{50049};
                break;
            case 33630:
                objectComposition.an = new int[]{50049};
                break;
            case 33631:
                objectComposition.an = new int[]{50049};
                break;
            case 33632:
                objectComposition.an = new int[]{50049};
                break;
            case 33633:
                objectComposition.an = new int[]{50049};
                break;
            case 33634:
                objectComposition.an = new int[]{50049};
                break;
            case 33635:
                objectComposition.an = new int[]{50049};
                break;
            case 33636:
                objectComposition.an = new int[]{50049};
                break;
            case 33641:
                objectComposition.an = new int[]{50049};
                break;
            case 33642:
                objectComposition.an = new int[]{50049};
                break;
            case 33643:
                objectComposition.an = new int[]{50049};
                break;
            case 33644:
                objectComposition.an = new int[]{50049};
                break;
            case 33645:
                objectComposition.an = new int[]{50049};
                break;
            case 33646:
                objectComposition.an = new int[]{50049};
                break;
            case 33647:
                objectComposition.an = new int[]{50049};
                break;
            case 33648:
                objectComposition.an = new int[]{50049};
                break;
            case 34807:
                objectComposition.an = new int[]{50037};
                break;
            case NVFloatBuffer.GL_FLOAT_RG_NV /* 34945 */:
                objectComposition.an = new int[]{50049};
                break;
            case NVFloatBuffer.GL_FLOAT_RGB_NV /* 34946 */:
                objectComposition.an = new int[]{50049};
                break;
            case 37440:
                objectComposition.an = new int[]{50049};
                break;
            case 37491:
                objectComposition.an = new int[]{50037};
                break;
            case 37623:
                objectComposition.an = new int[]{50049};
                break;
            case 37624:
                objectComposition.an = new int[]{50049};
                break;
            case 37625:
                objectComposition.an = new int[]{50049};
                break;
            case 37626:
                objectComposition.an = new int[]{50049};
                break;
            case 37627:
                objectComposition.an = new int[]{50049};
                break;
            case 37628:
                objectComposition.an = new int[]{50049};
                break;
        }
    }
}

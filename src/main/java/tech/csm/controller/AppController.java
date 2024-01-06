package tech.csm.controller;

import tech.csm.entity.Block;
import tech.csm.entity.Panchayat;
import tech.csm.entity.Village;
import tech.csm.entity.VillageResponse;
import tech.csm.service.*;

import java.util.List;
import java.util.Scanner;

public class AppController {

    private static final BlockService blockService = new BlockServiceImpl();
    private static final PanchayatService panchayatService = new PanchayatServiceImpl();
    private static final VillageService villageService = new VillageServiceImpl();

    private static int initial = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);


        int choice;
        do {
            System.out.println("1.Add Village \n2.Show All Villages \n3.Exit");
            System.out.println("Enter choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter village name:");
                    String villageName = ss.nextLine().trim();

                    System.out.println("Enter village population");
                    Integer population = sc.nextInt();

                    System.out.println("Enter the Block id" + blockService.getAllBlocks());
                    Integer blockId = sc.nextInt();

                    System.out.println("Enter Panchayat id:" + panchayatService.getAllPanchayatByBlockId(blockId));
                    Integer panchayatId = sc.nextInt();

                    Village village = new Village();

                    Block block = new Block();
                    block.setBlockId(blockId);
                    village.setBlock(block);

                    village.setVillageName(villageName);
                    village.setPopulation(population);

                    Panchayat panchayat = new Panchayat();
                    panchayat.setPanchayatId(panchayatId);
                    village.setPanchayat(panchayat);

                    String response = villageService.addVillage(village);
                    System.out.println(response);

                    break;

                case 2:
                    //get all villages by overriding toString method
                    List<Village> villageList = villageService.getAllVillages();
                    villageList.forEach(System.out::println);
                    System.out.println();
                    System.out.println("___________________________________");
                    System.out.println();
                    List<VillageResponse> villageResponseList = villageService.getVillages();
                    villageResponseList.forEach(System.out::println);

                    System.out.println();
                    System.out.println("___________________________________");
                    System.out.println();

                    //get all villages by overriding toString method - joins
                    List<VillageResponse> villageResponseList2 = villageService.getVillages();
                    villageResponseList.forEach(System.out::println);

                    System.out.println("#SNo | Name | NPeople | BName | PName");
                    System.out.println("--------------------------------");
                    for (VillageResponse x : villageResponseList2){
                        System.out.println("#"+ ++initial + " | " + x.getVillageName() + " | " + x.getPopulation() + " | " + x.getBlockName() + " | " + x.getPanchayatName());
                    }

                    break;
                case 3:
                    break;
                default:
                    System.out.println("Wrong choice ....try again");
                    break;
            }

        } while (choice != 3);
    }
}

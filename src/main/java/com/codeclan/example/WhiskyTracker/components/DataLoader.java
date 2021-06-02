package com.codeclan.example.WhiskyTracker.components;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    DistilleryRepository distilleryRepository;

    @Autowired
    WhiskyRepository whiskyRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) throws Exception {

        Distillery distillery1 = new Distillery("Glendronach", "Highland");
        distilleryRepository.save(distillery1);


        Whisky whisky1 = new Whisky("The Glendronach Revival", 2018, 15, distillery1);
        whiskyRepository.save(whisky1);

        Distillery distillery2 = new Distillery("Rosebank", "Lowland");
        distilleryRepository.save(distillery2);

        Whisky whisky2 = new Whisky("The Rosebank 12 - Flora and Fona", 1991, 12, distillery2);
        whiskyRepository.save(whisky2);


        Distillery distillery3 = new Distillery("Macallan", "Speyside");
        distilleryRepository.save(distillery3);


        Whisky whisky3 = new Whisky("The Macallan Anniversary Malt", 1995, 25, distillery3);
        whiskyRepository.save(whisky3);

        Whisky whisky4 = new Whisky("The Glendronach Original", 2018, 12, distillery1);
        whiskyRepository.save(whisky4);

        Distillery distillery4 = new Distillery("Balvenie", "Speyside");
        distilleryRepository.save(distillery4);


        Distillery distillery5 = new Distillery("Highland Park", "Island");
        distilleryRepository.save(distillery5);

        Whisky whisky5 = new Whisky("Viking Honour", 2017, 12, distillery5);
        whiskyRepository.save(whisky5);

        Whisky whisky6 = new Whisky("Twist Tattoo", 2019, 16, distillery5);
        whiskyRepository.save(whisky6);

        Distillery distillery6 = new Distillery("Old Pulteney", "Highland");
        distilleryRepository.save(distillery6);

        Whisky whisky7 = new Whisky("Old Pulteney 12", 2018, 12, distillery6);
        whiskyRepository.save(whisky7);

        Whisky whisky8 = new Whisky("Old Pulteney 18", 2018, 18, distillery6);
        whiskyRepository.save(whisky8);

        Distillery distillery7 = new Distillery("Blair Athol", "Highland");
        distilleryRepository.save(distillery7);

        Whisky whisky9 = new Whisky("Flora and Fauna", 2020, 12, distillery7);
        whiskyRepository.save(whisky9);

        Whisky whisky10 = new Whisky("Lady of the Glen", 2005, 13, distillery7);
        whiskyRepository.save(whisky10);

        Distillery distillery8 = new Distillery("Glenkinchie", "Lowland");
        distilleryRepository.save(distillery8);

        Whisky whisky11 = new Whisky("The Manager's Dram", 2010, 15, distillery8);
        whiskyRepository.save(whisky11);

        Whisky whisky12 = new Whisky("Glenkinchie 10", 1987, 10, distillery8);
        whiskyRepository.save(whisky12);
        Distillery distillery9 = new Distillery("Lagavulin", "Islay");
        distilleryRepository.save(distillery9);

        Whisky whisky13 = new Whisky("Lagavulin 16 Year Old", 2014, 16, distillery9);
        whiskyRepository.save(whisky13);

        Whisky whisky14 = new Whisky("Lg10 - Elements of Islay" , 2007, 1, distillery9);
        whiskyRepository.save(whisky14);

        Distillery distillery10 = new Distillery("Laphroaig", "Islay");
        distilleryRepository.save(distillery10);

        Whisky whisky15 = new Whisky("Lagavulin 16 Year Old", 2014, 16, distillery8);
        whiskyRepository.save(whisky15);

        Whisky whisky16 = new Whisky("Lg10 - Elements of Islay" , 2007, 1, distillery7);
        whiskyRepository.save(whisky16);

        Distillery distillery11 = new Distillery("Talisker", "Island");
        distilleryRepository.save(distillery11);

        Whisky whisky17 = new Whisky("57° North", 2014, 1, distillery11);
        whiskyRepository.save(whisky17);

        Whisky whisky18 = new Whisky("Skye" , 2015, 1, distillery11);
        whiskyRepository.save(whisky18);

        Distillery distillery12 = new Distillery("Isle of Arran","Island" );
        distilleryRepository.save(distillery12);

        Whisky whisky19 = new Whisky("Caskstrength and Carry On", 2011, 13, distillery12);
        whiskyRepository.save(whisky19);

        Whisky whisky20 = new Whisky("Seven Wood" , 2018, 1, distillery12);
        whiskyRepository.save(whisky20);
        Distillery distillery13 = new Distillery("The Glenlivet","Speyside" );

        distilleryRepository.save(distillery13);
        Whisky whisky21 = new Whisky("Founder's Reserve", 2014, 12, distillery13);
        whiskyRepository.save(whisky21);

        Whisky whisky22 = new Whisky("Carmaferg" , 2018, 18, distillery13);
        whiskyRepository.save(whisky22);
    }
}

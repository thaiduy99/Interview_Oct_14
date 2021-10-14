package com.example.demo;

import com.example.demo.domain.MyMessage;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    Gson gson;

    @Autowired
    RestTemplate restTemplate;

    @Test
    void contextLoads() {
        String testData = "{\"message\":{\n" +
                "    \"wolfhound\": [\n" +
                "      \"irish\"\n" +
                "    ],\n" +
                "    \"whippet\": [],\n" +
                "    \"weimaraner\": [],\n" +
                "    \"waterdog\": [\n" +
                "      \"spanish\"\n" +
                "    ],\n" +
                "    \"vizsla\": [],\n" +
                "    \"terrier\": [\n" +
                "      \"american\",\n" +
                "      \"australian\",\n" +
                "      \"bedlington\",\n" +
                "      \"border\",\n" +
                "      \"dandie\",\n" +
                "      \"fox\",\n" +
                "      \"irish\",\n" +
                "      \"kerryblue\",\n" +
                "      \"lakeland\",\n" +
                "      \"norfolk\",\n" +
                "      \"norwich\",\n" +
                "      \"patterdale\",\n" +
                "      \"russell\",\n" +
                "      \"scottish\",\n" +
                "      \"sealyham\",\n" +
                "      \"silky\",\n" +
                "      \"tibetan\",\n" +
                "      \"toy\",\n" +
                "      \"westhighland\",\n" +
                "      \"wheaten\",\n" +
                "      \"yorkshire\"\n" +
                "    ],\n" +
                "    \"stbernard\": [],\n" +
                "    \"springer\": [\n" +
                "      \"english\"\n" +
                "    ],\n" +
                "    \"spaniel\": [\n" +
                "      \"blenheim\",\n" +
                "      \"brittany\",\n" +
                "      \"cocker\",\n" +
                "      \"irish\",\n" +
                "      \"japanese\",\n" +
                "      \"sussex\",\n" +
                "      \"welsh\"\n" +
                "    ],\n" +
                "    \"shihtzu\": [],\n" +
                "    \"shiba\": [],\n" +
                "    \"sheepdog\": [\n" +
                "      \"english\",\n" +
                "      \"shetland\"\n" +
                "    ],\n" +
                "    \"setter\": [\n" +
                "      \"english\",\n" +
                "      \"gordon\",\n" +
                "      \"irish\"\n" +
                "    ],\n" +
                "    \"schnauzer\": [\n" +
                "      \"giant\",\n" +
                "      \"miniature\"\n" +
                "    ],\n" +
                "    \"schipperke\": [],\n" +
                "    \"samoyed\": [],\n" +
                "    \"saluki\": [],\n" +
                "    \"rottweiler\": [],\n" +
                "    \"ridgeback\": [\n" +
                "      \"rhodesian\"\n" +
                "    ],\n" +
                "    \"retriever\": [\n" +
                "      \"chesapeake\",\n" +
                "      \"curly\",\n" +
                "      \"flatcoated\",\n" +
                "      \"golden\"\n" +
                "    ],\n" +
                "    \"redbone\": [],\n" +
                "    \"pyrenees\": [],\n" +
                "    \"puggle\": [],\n" +
                "    \"pug\": [],\n" +
                "    \"poodle\": [\n" +
                "      \"miniature\",\n" +
                "      \"standard\",\n" +
                "      \"toy\"\n" +
                "    ],\n" +
                "    \"pomeranian\": [],\n" +
                "    \"pointer\": [\n" +
                "      \"german\",\n" +
                "      \"germanlonghair\"\n" +
                "    ],\n" +
                "    \"pitbull\": [],\n" +
                "    \"pinscher\": [\n" +
                "      \"miniature\"\n" +
                "    ],\n" +
                "    \"pembroke\": [],\n" +
                "    \"pekinese\": [],\n" +
                "    \"dhole\": [],\n" +
                "    \"deerhound\": [\n" +
                "      \"scottish\"\n" +
                "    ],\n" +
                "    \"dane\": [\n" +
                "      \"great\"\n" +
                "    ],\n" +
                "    \"dalmatian\": [],\n" +
                "    \"dachshund\": [],\n" +
                "    \"cotondetulear\": [],\n" +
                "    \"corgi\": [\n" +
                "      \"cardigan\"\n" +
                "    ],\n" +
                "    \"coonhound\": [],\n" +
                "    \"collie\": [\n" +
                "      \"border\"\n" +
                "    ],\n" +
                "    \"cockapoo\": [],\n" +
                "    \"clumber\": [],\n" +
                "    \"chow\": [],\n" +
                "    \"chihuahua\": [],\n" +
                "    \"cattledog\": [\n" +
                "      \"australian\"\n" +
                "    ],\n" +
                "    \"cairn\": [],\n" +
                "    \"bullterrier\": [\n" +
                "      \"staffordshire\"\n" +
                "    ],\n" +
                "    \"beagle\": [],\n" +
                "    \"basenji\": [],\n" +
                "    \"australian\": [\n" +
                "      \"shepherd\"\n" +
                "    ],\n" +
                "    \"appenzeller\": [],\n" +
                "    \"akita\": [],\n" +
                "    \"airedale\": [],\n" +
                "    \"african\": [],\n" +
                "    \"affenpinscher\": [],\n" +
                "    \"bluetick\": [],\n" +
                "    \"borzoi\": [],\n" +
                "    \"bouvier\": [],\n" +
                "    \"boxer\": [],\n" +
                "    \"brabancon\": [],\n" +
                "    \"briard\": [],\n" +
                "    \"buhund\": [\n" +
                "      \"norwegian\"\n" +
                "    ],\n" +
                "    \"bulldog\": [\n" +
                "      \"boston\",\n" +
                "      \"english\",\n" +
                "      \"french\"\n" +
                "    ],\n" +
                "    \"dingo\": [],\n" +
                "    \"doberman\": [],\n" +
                "    \"elkhound\": [\n" +
                "      \"norwegian\"\n" +
                "    ],\n" +
                "    \"entlebucher\": [],\n" +
                "    \"eskimo\": [],\n" +
                "    \"finnish\": [\n" +
                "      \"lapphund\"\n" +
                "    ],\n" +
                "    \"frise\": [\n" +
                "      \"bichon\"\n" +
                "    ],\n" +
                "    \"germanshepherd\": [],\n" +
                "    \"greyhound\": [\n" +
                "      \"italian\"\n" +
                "    ],\n" +
                "    \"groenendael\": [],\n" +
                "    \"havanese\": [],\n" +
                "    \"hound\": [\n" +
                "      \"afghan\",\n" +
                "      \"basset\",\n" +
                "      \"blood\",\n" +
                "      \"english\",\n" +
                "      \"ibizan\",\n" +
                "      \"plott\",\n" +
                "      \"walker\"\n" +
                "    ],\n" +
                "    \"husky\": [],\n" +
                "    \"keeshond\": [],\n" +
                "    \"kelpie\": [],\n" +
                "    \"komondor\": [],\n" +
                "    \"kuvasz\": [],\n" +
                "    \"labradoodle\": [],\n" +
                "    \"labrador\": [],\n" +
                "    \"leonberg\": [],\n" +
                "    \"lhasa\": [],\n" +
                "    \"malamute\": [],\n" +
                "    \"malinois\": [],\n" +
                "    \"maltese\": [],\n" +
                "    \"mastiff\": [\n" +
                "      \"bull\",\n" +
                "      \"english\",\n" +
                "      \"tibetan\"\n" +
                "    ],\n" +
                "    \"mexicanhairless\": [],\n" +
                "    \"mix\": [],\n" +
                "    \"mountain\": [\n" +
                "      \"bernese\",\n" +
                "      \"swiss\"\n" +
                "    ],\n" +
                "    \"newfoundland\": [],\n" +
                "    \"otterhound\": [],\n" +
                "    \"ovcharka\": [\n" +
                "      \"caucasian\"\n" +
                "    ],\n" +
                "    \"papillon\": []\n" +
                "},\"status\":\"success\"}";
        MyMessage expMessage = gson.fromJson(testData, MyMessage.class);
        MyMessage actMessage = restTemplate.getForObject("http://localhost:8080/api/breeds/list/all", MyMessage.class);
        Assert.isTrue(expMessage.equals(actMessage), "Error: Wrong information");
    }

}

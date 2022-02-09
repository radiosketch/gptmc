# PoC: GPT in Minecraft
My goal with this project is to demonstrate the feasibility of incorporating GPT-3, or a GPT-Alternative into a Minecraft Mod. In this example, I plan to use GPT-J as an open source alternative with improved performance.

See [PROTOBLOGPOSTS.md](https://github.com/radiosketch/gptmc/blob/1.16.5/PROTOBLOGPOSTS.md) for the most updated info as research continues

# Early R&D, by rad1osketxh
I'm not sure how else to start planning what I want, so this section is dedicated to
getting across how I want to start blogging, designing assets for eventually vlogging &
producing content online.

This section may also serve as an initial blog post, so **~Hello There!  ! ! Welcome to my Blog!!~**

- **Abstract Structuring**:  
  **How can GPT control the game?**
    - I don't know lol; my early research strategy is to pose ideas and see what sticks. I expect that the majority of the ideas here will be invalidated later. 
  **Assuming it's possible to get GPT-3 to control the game at some point, What do we do?**
    - As GPT receives information, it should be able to interrupt and update mc.ai with new instructions. These instructions should be expected not to allow dangerous decisions, such as jumping off a cliff. An error checking / path-testing algorithm should be used to translate GPT instructions into safe moves by the agent. GPT may be able to be trained with sufficient data about the world that directly teaches the AI about consequences; *save the devs the hard work please, GPT*.
    - See the best of what [MineRL](https://minerl.io/diamond/) has to offer, and you might see why some mix between learning and hardcoding decision-making may be necessary; however, GPT has little history with MineRL, so a more sophisticated network may provide an edge.
    - Should we decide to train a model, we'd have to follow the rules of dealing with AI: 'Garbage in, garbage out', so we'd need to collect dense data representing continuous in-game activity.
    - Regardless of performing any training, this data should be collected from the game in a manner that
      most accurately replicates real-time events. Web API Queries could be a bottleneck using some cloud solutions, yet processing times should be kept down to prevent delayed action calls. Efforts should be made to decrease the effects of these factors, while ongoing research struggles to document new breakthroughs in efficiency.
        - Sight; Recognition of blocks, biomes, weather, entities, hazards. Implementing existing mob AI for movement would solve this; however, GPT should be kept aware of this separately computed movement for accurate situational awareness, and be allowed to have an input on which decisions are made.
        - Sound; Listening to in-game chat & surrounding events
            - Speech; The mob that chats back! Should these mobs be allowed to read global chat? Local chat provides less stressful computation conditions.
        - Location; generate points of interest.
        - Touch; Agility for combat???
            - Strong emphasis on fast api calls, or intense forward planning.

Let's go back through the notes, shall we?

## Research
It's important to know the full functionality of the extensive
libraries that surround both the Minecraft engine and GPT-J, so I'd like to begin
the process of wrapping my head, as well as my code, around the basics.

See the resources section at the bottom

#### Goals for development.
1. Tokenization of in-game events
    - TODO: This should be my first section to design tests for
2. Communication between MC Engine and GPT-J
    - TODO:
3. Methods for unique use-cases of GPT-J
4. A detailed list of in-game methods of controlling virtual characters
5. Decoding GPT-J responses into in-game actions
6. Optimization tactics for faster AI response time

## Development  
Draft of what kind of structure may be necessary to achieve comm between NN <--> Game  
![WIP Component View](https://cdn.discordapp.com/attachments/562801886634311680/908777047835414679/gptmcDataFlow.png)

#### Tasks TODO:
* Collect game events accurately into JSON packets
  * A: This seems to be the fastest method of collecting data from MC, with minimal tampering.
  * B: Examining methods of directly logging McEvents as ```CAT<nip>``` could be worth valuable compute time.
* Format JSON data to ```Cat<nip>```, a known tokenizing strategy that works well with Transformers
* Transmit this as input to a pretrained AI
* Receive a response and transform to agent response.

## Works Cited: By Category
### MC Modding: Communication with External Programs
TODO: Add related documentation
### MC Modding: Custom Entity AI
[Jabelar's Minecraft Forge Modding Tutorials](http://jabelarminecraft.blogspot.com/p/minecraft-forge-1721710-custom-entity-ai.html)
### Transformers: Training to become an NPC in Minecraft
[Announcing AI21 Studio and Jurassic-1 Language Models](https://www.ai21.com/blog/announcing-ai21-studio-and-jurassic-1)
#### Transformers: Papers
* [Language Models are Few-Shot Learners](https://arxiv.org/pdf/2005.14165.pdf)
* [Natural Language Supervision](https://cdn.openai.com/papers/Learning_Transferable_Visual_Models_From_Natural_Language_Supervision.pdf)
* [Jurassic-1 Technical Details](https://uploads-ssl.webflow.com/60fd4503684b466578c0d307/61138924626a6981ee09caf6_jurassic_tech_paper.pdf)  
* [GPT-J GitHub Repo](https://github.com/kingoflolz/mesh-transformer-jax/#gpt-j-6b)  
#### Development Solutions (Python & Neural Networks):
* [(Free Trial) Google TPU Research Cloud]()
* [(Hourly Cost) AIx Text Generation]()
* [CAT\<nip\> (NSFW, Thanks AI Dungeon) Google Doc](https://docs.google.com/document/d/1SCi91qXdAKvHEEmFqTQnEpn1JX02fA6vRd7v2SCdmbs/edit)
    > "A structured, highly accurate, and agile format for use with [AI Dungeon's](https://play.aidungeon.io/main/home) Griffin and Dragon models. CAT<nip> format makes use of optimized tokenization (documentation coming soon courtesy of RogueSphinx)"  
      "It is doubtful that any format will ever achieve 100% accuracy with GPT-3. However, CAT<nip> can come close to 99.99% accuracy for many things (documentation coming soon)."  
      -- [Curious Nekomimi](https://www.reddit.com/user/curious_nekomimi/comments/kqu6zl/catnip_format_character_generator_nsfwsfw_version/?utm_source=share&utm_medium=web2x&context=3)
* [Environment Setup With Google Cloud TPU](https://github.com/kingoflolz/mesh-transformer-jax/blob/master/howto_finetune.md)
* [Command Prediction](https://pdf.sciencedirectassets.com/271427/1-s2.0-S0926580521X00118/1-s2.0-S0926580521004775/main.pdf?X-Amz-Security-Token=IQoJb3JpZ2luX2VjEPz%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJGMEQCICEUaqRZe5y%2FwRn5AHv0JrlbpSVZV6TBfRVXRv7OCH%2BwAiAOWa6OcI7A3u%2BGfw5HZcOfIXqPABtejY3Sp3CC3G%2BNayqDBAjl%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F8BEAQaDDA1OTAwMzU0Njg2NSIMLTdfkplVozb7tpl0KtcD50Aty19oj9GxoVj%2FdRGa8VK6nZat%2FRtY9RYy7tZu42JxxvCrYvD6mA5sIdWQm%2F4aaEI3PebI%2FKPEn8zN5eU2%2BTDye5iGQK0v68GC1YQOkGJwfBCxb9UN1DVsRz%2B5siiB5TyWRDrkvhwBVwTF6ur1jbXASHIy6SAv9T4duagMV6UFWyi7k4ETmiwkWDziJkIwg79GvHdZ8KAO1CpRs%2FUkViivOKEQldh8BuOCSxzs1Ye9%2BiC8vr%2F2HkJ9zyrzruw7HdvyOwChdXpycFmdOpxDXUTHwNmdkIwXFjPY57w6Z%2BRkRZ8dA9qL9usLkkrc6KY4YYMP3CdUlyp3ERGu%2BbZG%2F3UUFhWfhTilp6E0ZzI3PvWt9RDWscyD1ZVV8K%2F8K0uz8G0MLDXNLW7S%2FOjZatHE2wDDDNVvrIftrYoTTaV7niwczKxKpcEg1OO956xjguNnB0SKGHrHQHtOTianRIwcVArnfZBG36r2QTiy4CReOEKve5QL6dwH7bUlFq8wGQQvbzp1om9YffNbsFJ%2BZ4RNn9zcj8J5EP9zZCQtDoZp5VjwB9pb8oP1LvC0DnHF%2FUt3Hy5f0PRQBRNnxn00s3tPD3Scn5dw1Oao8xb8MpLpORcZp84bzylWMKr4%2F40GOqYBZrhi1tx9ZR1f979KoTtZBm7GbWrHecWIpPx7UHQNxf9Vvsbs7UyJBbM7215uyLHDf%2F8Oimjg1kz48DyHYCZ7EBrdUTPCi%2B4StJbihATD43InivlY13XaPq9%2Bo7qSS90OBA0h0QNxXsvtvs71IpZqQ3pHO%2Bw6BtxVST2KA64ZjWAoEkdFjxRiYGR87LloZ4EEbaAP0db1AMBsTVtjV5VsfRZy2xD2Gg%3D%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20211220T043901Z&X-Amz-SignedHeaders=host&X-Amz-Expires=300&X-Amz-Credential=ASIAQ3PHCVTY3REMP6OJ%2F20211220%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Signature=3f337000c9b0c8aea2182d98c2a3168ed10c20334cf0f75bd41137076a04b632&hash=8342954e4f6120f46b4203559575209af50594feb6941310e283c7494aca4b9b&host=68042c943591013ac2b2430a89b270f6af2c76d8dfd086a07176afe7c76c2c61&pii=S0926580521004775&tid=spdf-630e8590-e4b4-461c-a93f-5e4922839469&sid=32831ade430eb24f9658059673bb07227bbfgxrqa&type=client)
  * Data Extracting and augmenting through COG Logs command-line, into an augmented command-line
  * Meaning; i think, that we can examine logs of Command Object Graphs (COGs), which allow us to observe cause-and-effect chains, and generate an 'augmented' response(? can this really be considered a response) command-line
  * With the knowledge gained from such perception; it could be possible for a similar NN agent, or hivemind of agents, to observe its environment, the objects within it, and the discrete chains of actions needed to interact with it.
  * More reading is required.
#### Development Solutions (Java)
* [Java Command Patterns](https://www.youtube.com/watch?v=QUMEPrQzZzU)

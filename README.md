# PoC: GPT in Minecraft
This project is designed to be a **proof of concept** for incorporating
GPT-3 into a Minecraft Mod. In this example, I plan to use GPT-J as an
open source alternative with the benefits (and drawbacks) of increased performance.

# Philosophy of Design, by rad1osketxh
I'm not sure how else to start planning what I want, so this section is dedicated to
getting across how I want to start blogging, designing assets for eventually vlogging &
producing content online.

This section may also serve as an initial blog post, so **~Hello There!  ! ! Welcome to my Blog!!~**

Let's go back through the notes, shall we?

## Research
It's important to know the full functionality of the extensive
libraries that surround both the Minecraft engine and GPT-J, so I'd like to begin
the process of wrapping my head, as well as my code, around the basics.

See the resources section at the bottom

####Goals for development.
1. Tokenization of in-game events

    - TODO: This should be my first section to design tests for
- **Abstract Structuring**:  
  **Cool, we made the Env, What do we do next?**
    - As GPT receives information, it should be able to interrupt and update mc.ai with new instructions. These instructions should be expected not to allow dangerous decisions, such as jumping off a cliff. An error checking / path-testing algorithm should be used to translate GPT instructions into safe moves by the agent. GPT may be able to be trained with sufficient data about the world that directly teaches the AI about consequences; *save the devs the hard work please, GPT*.
    - See the best of what [MineRL](https://minerl.io/diamond/) has to offer, and you might see why some mix between learning and hardcoding decision-making may be necessary; however, GPT has little history with MineRL, so a more sophisticated network may provide an edge.
    - As always, we have to follow the rules of dealing with AI: 'Garbage in, garbage out', so we need to collect dense data representing continuous in-game activity.
    - This data should be collected from the game in a manner that
      roughly replicates the senses of players, which could be used to collect data for use in training.
        - Sight; Recognition of blocks, biomes, weather, entities, hazards. Implementing existing mob AI for movement would solve this; however, GPT should be kept aware of this separately computed movement for accurate situational awareness, and be allowed to have an input on which decisions are made.
        - Sound; Listening to in-game chat & surrounding events
            - Speech; The mob that chats back! Should these mobs be allowed to read global chat? Local chat provides less stressful computation conditions.
        - Location; generate points of interest.
        - Touch; Agility for combat???
            - This section confuses me; while it seems possible to tokenize

2. Communication between MC Engine and GPT-J

    - TODO:
3. Methods for unique use-cases of GPT-J
4. A detailed list of in-game methods of controlling virtual characters
5. Decoding GPT-J responses into in-game actions
6. Optimization tactics for faster AI response time

## Development
![WIP Component View](https://cdn.discordapp.com/attachments/562801886634311680/908777047835414679/gptmcDataFlow.png)
#### Tasks TODO:
* Collect game events accurately into JSON packets
  * A: This seems to be the fastest method of collecting data from MC, with minimal tampering.
  * B: Examining methods of directly logging McEvents as ```CAT<nip>``` could be worth valuable compute time.
* Format JSON data to ```Cat<nip>```, a known tokenizing strategy that works well with Transformers
* Transmit this as input to a pretrained AI
* Receive a response and transform to agent response.

## Works Cited: By Category
### Minecraft Modding: Communication with External Programs
TODO: Add related documentation
### GPT-J: Training to become an NPC in Minecraft
#### Papers:
* [Natural Language Supervision](https://cdn.openai.com/papers/Learning_Transferable_Visual_Models_From_Natural_Language_Supervision.pdf), related to our training technique.

[GPT-J GitHub Repo](https://github.com/kingoflolz/mesh-transformer-jax/#gpt-j-6b)
#### Development Pipeline:
Cloud Solutions:
* [(Free Trial) Google TPU Research Cloud]()
* [(Hourly Cost) AIx Text Generation]()
* 
>Examining existing software solutions to Copy™ and Paste™ into our Brand-New™ and Innovative™ Product™.
  * [CAT\<nip\> Google Doc](https://docs.google.com/document/d/1SCi91qXdAKvHEEmFqTQnEpn1JX02fA6vRd7v2SCdmbs/edit)
      > "A structured, highly accurate, and agile format for use with [AI Dungeon's](https://play.aidungeon.io/main/home) Griffin and Dragon models. CAT<nip> format makes use of optimized tokenization (documentation coming soon courtesy of RogueSphinx)"  
        "It is doubtful that any format will ever achieve 100% accuracy with GPT-3. However, CAT<nip> can come close to 99.99% accuracy for many things (documentation coming soon)."  
        -- [Curious Nekomimi](https://www.reddit.com/user/curious_nekomimi/comments/kqu6zl/catnip_format_character_generator_nsfwsfw_version/?utm_source=share&utm_medium=web2x&context=3)
  * [Environment Setup With Google Cloud TPU](https://github.com/kingoflolz/mesh-transformer-jax/blob/master/howto_finetune.md)
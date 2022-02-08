---
### 1/31/22 : : The search for validation (or invalidation) continues
Further research shows that LMs like GPT-J will be insufficient for task-planning agents,
leading to the idea that initial concepts may only focus on chatting with players.

See the following paper on the current state of action planning:  
[1/18/22 : : Language Models as Zero-Shot Planners:
Extracting Actionable Knowledge for Embodied Agents](https://arxiv.org/pdf/2201.07207.pdf)
- Preceding research on simulating activities in a virtual environment:  
  [6/19/18 : : VirtualHome: Simulating Household Activities via Programs](https://arxiv.org/pdf/1806.07011.pdf)

What is needed to implement a chatbot in minecraft?
- Can minecraft mods call external APIs? YES
- Can a chatbot be implemented in minecraft? YES  
  [4/6/21 : : Minecraft-AI-Chatbot : : CurseForge](https://www.curseforge.com/minecraft/mc-mods/ai-chatbot)  
  [Chatter-Bot-API (last updated 5 years ago)](https://github.com/pierredavidbelanger/chatter-bot-api)
- Can entities be interacted with in text chat?
    - this has not been widely published by mod makers yet 0-o
---
### 2/7/22 : : Custom Environments with Stable Baselines 3  
A reinforcement learning package like Stable Baselines could be suitable to begin training in a
custom environment. Implementation of Minecraft as a training environment appears
questionably difficult.  

"Stable Baselines is a set of improved implementations of Reinforcement Learning (RL) algorithms based on
OpenAI Baselines." [Stable Baselines Docs](https://stable-baselines.readthedocs.io/en/master/)  
- Part 3 of implementing a custom RL environment, by [sentdex](https://youtu.be/uKnjGn8fF70)  
  - Check back later for Part 4 where optimizations will be made to punishment strategies.

I should probably try to implement a custom environment in simpler open-source games as a learning
exercise. Moving up to a 2D sandbox game would be suitable for preparing to implement a training
environment in Minecraft.
---
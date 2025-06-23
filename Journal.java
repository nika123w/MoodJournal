package com.example.journal;

import java.util.HashMap;
import java.util.Random;
import java.util.Map;

public class Journal {

    private final Map<String, String[]> advice = new HashMap<>();
    private final Random random = new Random();

    public Journal() {
        initializeAdvice();
    }

    private void initializeAdvice() {
        addAdvice("happy", "child", "male", new String[]{
                "Go outside and play, it will make you feel even happier!",
                "Try a new hobby, it will keep you entertained and joyful.",
                "Keep smiling, it's contagious!",
                "Take a moment to appreciate the little things around you.",
                "Have a snack that makes you happy, like your favorite candy."
        });
        addAdvice("happy", "child", "female", new String[]{
                "Do something creative like drawing or dancing.",
                "Call a friend and share some happy thoughts.",
                "Play with your favorite toys and enjoy the fun.",
                "Tell someone why you're happy – spreading joy is great!",
                "Take a walk in nature to celebrate your happiness."
        });
        addAdvice("happy", "teen", "male", new String[]{
                "Take a break and enjoy some music.",
                "Do something active like playing a sport or going for a run.",
                "Call up a friend to share your happiness.",
                "Set a goal and keep this positive momentum going.",
                "Celebrate your joy with a hobby or activity you love."
        });
        addAdvice("happy", "teen", "female", new String[]{
                "Share your happiness with your family and friends.",
                "Write down the reasons you're feeling happy today.",
                "Spend some time relaxing, maybe a nice bath.",
                "Take a break and do something creative, like painting.",
                "Enjoy the good times with the people around you!"
        });
        addAdvice("happy", "young adult", "male", new String[]{
                "Go for a hike and enjoy the outdoors.",
                "Take time to appreciate the small victories in your life.",
                "Send a positive message to a friend or family member.",
                "Take a moment to relax and savor this happy time.",
                "Consider journaling about what makes you happy today."
        });
        addAdvice("happy", "young adult", "female", new String[]{
                "Take a few moments for self-care and recharge your energy.",
                "Help someone in need today to make both of you happy.",
                "Try something creative like crafting or painting.",
                "Celebrate small successes and embrace the positivity.",
                "Reflect on your growth and feel proud of where you are."
        });
        addAdvice("happy", "middle-aged adult", "male", new String[]{
                "Focus on the positive and be grateful for what you have.",
                "Reflect on your achievements and plan new goals.",
                "Spend time with family or friends who make you feel good.",
                "Take a break and do something you've always wanted to try.",
                "Practice mindfulness and enjoy the present moment."
        });
        addAdvice("happy", "middle-aged adult", "female", new String[]{
                "Celebrate the good things in your life and reflect on them.",
                "Take some time for relaxation and self-care.",
                "Do something spontaneous to celebrate your happiness.",
                "Share your joy with loved ones, it makes the happiness grow.",
                "Take a walk or go for a nice meal to celebrate."
        });
        addAdvice("happy", "senior", "male", new String[]{
                "Spend quality time with family or close friends.",
                "Reflect on all the good memories you've collected.",
                "Take a quiet moment to appreciate the beauty around you.",
                "Enjoy some hobbies that bring you peace and joy.",
                "Take care of your health and keep moving forward."
        });
        addAdvice("happy", "senior", "female", new String[]{
                "Spend time with loved ones who make you happy.",
                "Reflect on the many wonderful moments in your life.",
                "Enjoy a calm, peaceful activity that brings you joy.",
                "Take a walk in nature and appreciate its beauty.",
                "Cherish your hobbies and try something new if possible."
        });
        addAdvice("sad", "child", "male", new String[]{
                "Talk to your parents or a friend about how you're feeling.",
                "It's okay to cry, sometimes it helps.",
                "Draw something that expresses how you feel.",
                "Take a short nap to refresh your mind.",
                "Play with your pet or stuffed animal to feel comforted."
        });
        addAdvice("sad", "child", "female", new String[]{
                "Find a cozy spot and read your favorite book.",
                "Draw something that represents your feelings.",
                "Talk to your family, they’ll support you.",
                "Write about your day and let out your emotions.",
                "Watch your favorite cartoon to cheer up!"
        });
        addAdvice("sad", "teen", "male", new String[]{
                "Talk to someone you trust about your feelings.",
                "Listen to music that helps you process emotions.",
                "Go for a walk, the fresh air may help you feel better.",
                "Take a break from screens and relax.",
                "Try some deep breathing exercises to calm yourself."
        });
        addAdvice("sad", "teen", "female", new String[]{
                "Talk to a friend about what’s bothering you.",
                "Do something that makes you feel relaxed, like journaling.",
                "It's okay to take some time for yourself to heal.",
                "Try some relaxation exercises to feel better.",
                "Watch a feel-good movie to lift your spirits."
        });
        addAdvice("sad", "young adult", "male", new String[]{
                "Reach out to someone who can listen to you.",
                "Try some mindfulness exercises to calm your mind.",
                "Journal your thoughts and emotions to better understand them.",
                "Get some fresh air and clear your head.",
                "Sometimes taking a break and resting is exactly what you need."
        });
        addAdvice("sad", "young adult", "female", new String[]{
                "It's okay to not feel okay. Reach out for support if needed.",
                "Try talking to a loved one, they might help you feel better.",
                "Engage in something creative that helps distract you.",
                "Take time for self-care, even a small pamper session can help.",
                "Go for a walk and enjoy the peace of nature."
        });
        addAdvice("sad", "middle-aged adult", "male", new String[]{
                "Take a break and reflect on the good things in your life.",
                "Engage in an activity that brings you peace, like reading.",
                "Reach out to someone you trust to talk about how you’re feeling.",
                "Try journaling about your thoughts and emotions.",
                "Take time to rest and recuperate your energy."
        });
        addAdvice("sad", "middle-aged adult", "female", new String[]{
                "Consider taking time for self-care and personal reflection.",
                "Talk to someone who can offer emotional support.",
                "Do something that helps you relax and calm your mind.",
                "Spend time with loved ones who lift your spirits.",
                "Take a break and give yourself permission to rest."
        });
        addAdvice("sad", "senior", "male", new String[]{
                "Spend time with friends or family, they can help you feel better.",
                "Sometimes, talking about your emotions can help lighten the load.",
                "Reflect on happy memories to help shift your mood.",
                "Try doing something that has always brought you joy.",
                "Take a short walk outside to lift your spirits."
        });
        addAdvice("sad", "senior", "female", new String[]{
                "Reach out to a close friend or family member for support.",
                "Reminisce about fond memories that bring you comfort.",
                "Do something gentle, like knitting or reading, to ease your mind.",
                "Sometimes resting and taking a break is the best form of healing.",
                "Watch your favorite cartoon to cheer up!"
        });
        addAdvice("excited", "child", "male", new String[]{
                "Share your excitement with a friend and enjoy the moment!",
                "Take some deep breaths and enjoy the anticipation.",
                "Jump around and let out your energy in a fun way!",
                "Celebrate by doing something fun and rewarding.",
                "Tell someone why you're excited – it'll make them smile too."
        });
        addAdvice("excited", "child", "female", new String[]{
                "Jump up and down or dance around to release your energy.",
                "Celebrate by having a mini party or doing something you love.",
                "Let someone know how excited you are – it'll make them smile too.",
                "Take a deep breath and focus on the good things ahead.",
                "Go for a fun activity like a treasure hunt or a game with friends."
        });
        addAdvice("excited", "teen", "male", new String[]{
                "Take some time to calm down before acting impulsively.",
                "Share your excitement with a friend, it’ll be more fun.",
                "Write down the reasons you're excited, it will keep you focused.",
                "Enjoy the feeling, but remember to stay grounded.",
                "Find something creative to channel your energy into."
        });
        addAdvice("excited", "teen", "female", new String[]{
                "Talk about your excitement with others, it'll boost your mood.",
                "Try to channel your energy into something creative or fun.",
                "Take a moment to appreciate how far you've come.",
                "Make a list of things you can do to make your excitement last.",
                "Celebrate in a way that makes you feel proud and happy."
        });
        addAdvice("excited", "young adult", "male", new String[]{
                "Take a moment to reflect on why you're excited.",
                "Find a way to share your excitement with friends or family.",
                "Use your energy to accomplish something you've been wanting to do.",
                "Engage in something that gets your creative juices flowing.",
                "Celebrate with a fun activity that you love doing."
        });
        addAdvice("excited", "young adult", "female", new String[]{
                "Let your excitement inspire those around you.",
                "Try to focus on the good things you're looking forward to.",
                "Find a way to spread your excitement, like sharing good news.",
                "Channel your energy into something productive or creative.",
                "Celebrate in a way that feels rewarding and fulfilling."
        });
        addAdvice("excited", "middle-aged adult", "male", new String[]{
                "Use your excitement to achieve something you've set out to do.",
                "Share your joy with others and celebrate together.",
                "Try to ground yourself by focusing on the moment.",
                "Get involved in a hobby that brings out your creative energy.",
                "Take time to reflect on the positive changes in your life."
        });
        addAdvice("excited", "middle-aged adult", "female", new String[]{
                "Celebrate this exciting time by doing something special for yourself.",
                "Take a moment to appreciate everything you're excited about.",
                "Engage in an activity that channels your energy into productivity.",
                "Consider sharing this excitement with others to spread the joy.",
                "Reflect on what excites you and use that energy for growth."
        });
        addAdvice("excited", "senior", "male", new String[]{
                "Share your excitement with someone close to you, they will be happy too.",
                "Take time to appreciate what’s making you excited right now.",
                "Use your energy to do something meaningful to you.",
                "Take it easy but don’t forget to savor the joy you're feeling.",
                "Celebrate the good moments, no matter how small."
        });
        addAdvice("excited", "senior", "female", new String[]{
                "Spend time doing something that you’ve been looking forward to.",
                "Tell a friend or family member about your excitement.",
                "Take a walk and enjoy the anticipation of what’s ahead.",
                "Reflect on the blessings in your life that bring excitement.",
                "Savor the good feelings and share your excitement with others."
        });
        addAdvice("anxious", "child", "male", new String[]{
                "Take deep breaths and focus on the present moment.",
                "Talk to a parent or guardian about how you feel.",
                "Try drawing or doing something creative to relax.",
                "Listen to calming music to ease your mind.",
                "It’s okay to feel anxious, take one step at a time."
        });
        addAdvice("anxious", "child", "female", new String[]{
                "Find a quiet place to calm your nerves.",
                "Take a break from stressful activities for a bit.",
                "Talk to an adult who can offer some comfort.",
                "Try playing a game to distract your mind.",
                "Be kind to yourself and give yourself time to feel better."
        });
        addAdvice("anxious", "teen", "male", new String[]{
                "Try some mindfulness techniques to relax your mind.",
                "Talk to a friend or counselor to relieve some stress.",
                "Take time to reflect on what’s causing the anxiety.",
                "Go for a walk to clear your head.",
                "It’s okay to ask for help if you need it."
        });
        addAdvice("anxious", "teen", "female", new String[]{
                "Take deep breaths and try to focus on something calming.",
                "Talk to someone you trust to share your feelings.",
                "Sometimes journaling your thoughts can help process anxiety.",
                "Practice grounding exercises to feel more connected to the present.",
                "Take a break and focus on self-care, you deserve it."
        });
        addAdvice("anxious", "young adult", "male", new String[]{
                "Try to break down the source of your anxiety into manageable steps.",
                "Take a break and engage in a relaxing activity like reading or listening to music.",
                "Don’t be afraid to talk to someone about how you’re feeling.",
                "Engage in some light exercise to relieve stress and calm your mind.",
                "Focus on the present moment and take things one step at a time."
        });
        addAdvice("anxious", "young adult", "female", new String[]{
                "Practice mindfulness or deep breathing to calm your nerves.",
                "Write down your worries to better understand them.",
                "Focus on your accomplishments to remind yourself of your strengths.",
                "Take a break from stressful tasks and do something enjoyable.",
                "Find a quiet place to relax and clear your mind."
        });
        addAdvice("anxious", "middle-aged adult", "male", new String[]{
                "Take a walk to clear your head and regain perspective.",
                "Use relaxation techniques like deep breathing or meditation.",
                "Talk to someone close to you about your anxiety to ease your mind.",
                "Focus on things that are within your control to regain a sense of calm.",
                "Remind yourself that anxiety is temporary and will pass."
        });
        addAdvice("anxious", "middle-aged adult", "female", new String[]{
                "Take time to relax and unwind, even if it’s just for a few minutes.",
                "Talk to a friend or family member about how you're feeling.",
                "Focus on self-care activities to soothe your nerves.",
                "Consider practicing yoga or meditation for relaxation.",
                "Break down tasks into smaller steps to reduce feelings of being overwhelmed."
        });
        addAdvice("anxious", "senior", "male", new String[]{
                "Spend time with loved ones to alleviate anxiety and feel supported.",
                "Engage in gentle physical activity like stretching to calm your nerves.",
                "Consider listening to music or audiobooks to distract your mind.",
                "Write down your thoughts to organize them and ease your anxiety.",
                "It’s okay to take breaks and focus on activities that bring you peace."
        });
        addAdvice("anxious", "senior", "female", new String[]{
                "Practice slow breathing to relax and reduce anxiety.",
                "Consider talking to someone about what’s causing you stress.",
                "Take time for yourself to do something calming and enjoyable.",
                "Focus on grounding exercises to keep your mind in the present.",
                "Consider engaging in a hobby or craft that brings you comfort."
        });
        addAdvice("tired", "child", "male", new String[]{
                "Rest for a while and take a nap to recharge.",
                "Drink some water and eat a healthy snack to refresh yourself.",
                "Play a quiet game to relax and regain energy.",
                "It’s okay to take a break, listen to your body.",
                "After some rest, you'll feel better and ready for more fun."
        });
        addAdvice("tired", "child", "female", new String[]{
                "Take a short nap to feel more energized.",
                "Drink some water and take a moment to relax.",
                "Maybe it's time for a quiet activity to recharge.",
                "Listen to your body and take breaks when needed.",
                "Rest is important; you'll feel better afterward."
        });
        addAdvice("tired", "teen", "male", new String[]{
                "Consider taking a power nap to boost your energy.",
                "Take a break from your tasks and relax for a bit.",
                "Try to avoid screens for a while and rest your eyes.",
                "Eat something healthy to fuel your body and mind.",
                "Hydrate yourself, a glass of water can do wonders."
        });
        addAdvice("tired", "teen", "female", new String[]{
                "Take a break, listen to your body, and rest when needed.",
                "Drink a refreshing beverage and try to relax.",
                "It’s okay to rest and recharge before getting back to work.",
                "Take a short nap or meditate for a bit to regain energy.",
                "Spend a few moments in a calm environment to relax your mind."
        });
        addAdvice("tired", "young adult", "male", new String[]{
                "Take a short nap or sleep to restore your energy.",
                "Focus on hydration and a light snack to feel rejuvenated.",
                "Do something calming like listening to music to help you unwind.",
                "It’s okay to take a rest – it will improve your productivity later.",
                "Prioritize rest, your body and mind need it."
        });
        addAdvice("tired", "young adult", "female", new String[]{
                "Try a short meditation to relax and recharge.",
                "Take a break and allow yourself time to rest.",
                "Drink water and maybe try a healthy snack for energy.",
                "A quick nap can do wonders for your energy levels.",
                "Spend time relaxing, whether it’s reading or listening to soothing music."
        });
        addAdvice("tired", "middle-aged adult", "male", new String[]{
                "Take time to rest and recuperate; your body needs it.",
                "Hydrate and take a short break to regain focus.",
                "Practice deep breathing to relax your body and mind.",
                "It’s important to listen to your body, take a moment to recharge.",
                "Engage in a relaxing hobby to help restore your energy."
        });
        addAdvice("tired", "middle-aged adult", "female", new String[]{
                "Allow yourself some time to rest and relax.",
                "Hydrate and eat a light snack to energize yourself.",
                "Listen to a calming podcast or music to unwind.",
                "Take breaks throughout the day to avoid exhaustion.",
                "Rest is essential for overall well-being, don’t hesitate to take time for yourself."
        });
        addAdvice("tired", "senior", "male", new String[]{
                "Take a break and enjoy some quiet time for yourself.",
                "Engage in gentle stretching or light activity to feel refreshed.",
                "Rest is key, take it slow and allow yourself to recharge.",
                "Consider taking a nap or simply resting your eyes.",
                "Spend time with loved ones and enjoy calm, peaceful moments."
        });
        addAdvice("tired", "senior", "female", new String[]{
                "Rest and recharge, listen to your body.",
                "Engage in light activities to help you feel rejuvenated.",
                "Take a moment to relax with a favorite hobby.",
                "Hydrate and eat small, nutritious snacks for energy.",
                "Take a nap or enjoy some quiet time to restore your energy."
        });
        addAdvice("scared", "child", "male", new String[]{
                "It’s okay to be scared sometimes, talk to someone you trust.",
                "Try holding onto something soft, like a stuffed animal, for comfort.",
                "Take deep breaths, count to five and back down.",
                "You can always talk to a parent or someone who makes you feel safe.",
                "Remember, fear is temporary, and you can be brave."
        });
        addAdvice("scared", "child", "female", new String[]{
                "It’s okay to be scared. Sometimes hugging a loved one helps.",
                "Talk to someone you trust about what’s making you scared.",
                "Take deep breaths to calm your nerves.",
                "It’s normal to feel scared, and you can always feel safe at home.",
                "Listening to soft music can help calm your mind."
        });
        addAdvice("scared", "teen", "male", new String[]{
                "It’s okay to feel scared. Talk it out with a friend or family member.",
                "Try grounding yourself by focusing on things you can see, hear, and touch.",
                "It’s normal to feel afraid, but this too shall pass.",
                "Consider doing something relaxing, like listening to music or drawing.",
                "You are stronger than you think. This moment will pass."
        });
        addAdvice("scared", "teen", "female", new String[]{
                "Take a few deep breaths to center yourself.",
                "Reach out to someone you trust, it can make a big difference.",
                "Ground yourself by focusing on your surroundings.",
                "Try doing a calming activity, like yoga or journaling.",
                "Remember, it’s okay to ask for help if you need it."
        });
        addAdvice("scared", "young adult", "male", new String[]{
                "Consider talking through your fears with a close friend or family member.",
                "Take a deep breath and remind yourself that you’re safe.",
                "Consider practicing mindfulness to manage your fear.",
                "It’s okay to have fear, but don’t let it control you.",
                "Remember, your fears are valid, but you can overcome them."
        });
        addAdvice("scared", "young adult", "female", new String[]{
                "Take a moment to breathe deeply and relax your body.",
                "Ground yourself by focusing on the present moment.",
                "Talking about what scares you can help you process your feelings.",
                "Remember that fear is often more overwhelming in our minds than in reality.",
                "You’re stronger than you think, and you’ll get through this."
        });
        addAdvice("scared", "middle-aged adult", "male", new String[]{
                "Focus on your breathing and take a moment to relax your mind.",
                "Consider talking to a trusted friend or loved one about what you’re experiencing.",
                "Think about what makes you feel safe and try to focus on that.",
                "Remind yourself of times when you overcame challenges before.",
                "It’s okay to feel scared. This feeling will eventually pass."
        });
        addAdvice("scared", "middle-aged adult", "female", new String[]{
                "Find comfort in speaking with someone you trust about your fear.",
                "Taking a break and grounding yourself can help bring calm.",
                "Sometimes focusing on self-care activities can help calm your nerves.",
                "Consider writing down your fears and thoughts to process them.",
                "Remember that feeling scared doesn’t mean you’re weak, it’s a normal response."
        });
        addAdvice("scared", "senior", "male", new String[]{
                "Try relaxing with a favorite hobby or activity to take your mind off the fear.",
                "Take deep breaths and focus on a sense of safety.",
                "It’s okay to feel afraid, but remember to reach out for support when needed.",
                "Talk to someone close to you about your fears, sharing can help.",
                "Engage in a calming activity, such as listening to soothing music."
        });
        addAdvice("scared", "senior", "female", new String[]{
                "Take a deep breath and try to relax your mind and body.",
                "Speak with a loved one or someone you trust about what’s making you scared.",
                "Try a calming activity, like reading a book or knitting.",
                "Focus on the present moment to relieve some of the fear.",
                "It’s okay to take things slow and focus on things that make you feel safe."
        });
        addAdvice("lazy", "child", "male", new String[]{
                "Sometimes it’s okay to rest, but remember to get up and play soon!",
                "Try to move around a bit, even if it’s just a fun game.",
                "You can do a small task to start, like cleaning up a toy or two.",
                "Take it easy for now, but don’t forget that playtime is important.",
                "When you feel rested, you’ll have more energy to do fun things."
        });
        addAdvice("lazy", "child", "female", new String[]{
                "Take a short break, but remember to stay active when you feel better.",
                "Try to get up and do a simple activity like coloring or a puzzle.",
                "It’s okay to rest, but soon you’ll have more energy to play.",
                "Even small movements can help you feel more energized.",
                "Remember that rest is important, but so is getting up and moving."
        });
        addAdvice("lazy", "teen", "male", new String[]{
                "Sometimes rest is needed, but don’t forget about your goals.",
                "Start by doing small tasks, they’ll help you feel more accomplished.",
                "It’s okay to take a break, but get back to work after a short rest.",
                "Taking breaks can help you stay productive in the long run.",
                "Remember that motivation comes from small steps forward."
        });
        addAdvice("lazy", "teen", "female", new String[]{
                "Take a break, but remember to get up and move soon.",
                "Do a simple task to start getting your energy back.",
                "It’s okay to rest, but don’t let the laziness take over your day.",
                "Start with one small task, and you’ll feel more motivated.",
                "A short walk or some stretching can give you a burst of energy."
        });
        addAdvice("lazy", "young adult", "male", new String[]{
                "Rest when you need it, but don’t let laziness hold you back from your goals.",
                "Start by tackling one small task to build momentum.",
                "Take a break, but set a timer to get back to work afterward.",
                "Motivation often comes after you start moving, so just take one step forward.",
                "Consider exercising to boost your energy and clear your mind."
        });
        addAdvice("lazy", "young adult", "female", new String[]{
                "Take a break, but make sure to get moving again after a short time.",
                "Set small goals for yourself and accomplish one at a time.",
                "Exercise can give you the boost of energy you need.",
                "Sometimes just starting with a small task helps you build momentum.",
                "Rest is okay, but don’t let it keep you from your dreams."
        });
        addAdvice("lazy", "middle-aged adult", "male", new String[]{
                "Rest is important, but don’t forget your goals.",
                "Take a short break, but get back to work soon.",
                "Set small goals to get you moving again.",
                "Motivation often follows action, so start with one small thing.",
                "Consider taking a walk to shake off the laziness and recharge."
        });
        addAdvice("lazy", "middle-aged adult", "female", new String[]{
                "Sometimes you need to rest, but don’t let it become a habit.",
                "Start small – tackle one thing to break the cycle.",
                "Move around a little, even a short walk will help.",
                "Focus on small, manageable tasks to get started.",
                "Remember, action leads to motivation."
        });
        addAdvice("lazy", "senior", "male", new String[]{
                "A short break is okay, but make sure to keep active later.",
                "Take a moment to rest, but set a timer to start moving again.",
                "Gentle exercise, like stretching, can give you energy.",
                "Start with small tasks and build momentum from there.",
                "It’s important to keep moving, even if it’s just a little."
        });
        addAdvice("lazy", "senior", "female", new String[]{
                "Rest when you need it, but make sure to move after a short break.",
                "Try a small task to get started, it will help you feel better.",
                "Gentle activity like walking or stretching can lift your mood.",
                "Taking breaks is fine, but don’t forget to keep your body active.",
                "Remember, even small movements can help you feel more energized."
        });
        addAdvice("angry", "child", "male", new String[]{
                "It’s okay to feel angry, but take a moment to breathe.",
                "Try talking to someone you trust about why you’re angry.",
                "Sometimes taking a break from the situation can help you calm down.",
                "Play with a toy or do something that helps you release your energy.",
                "When you’re feeling angry, try drawing or coloring to express yourself."
        });
        addAdvice("angry", "child", "female", new String[]{
                "It’s okay to feel mad, but try to talk to someone about it.",
                "Take a deep breath and count to ten to calm down.",
                "Try taking a short break to calm down before you talk to anyone.",
                "Hug a stuffed animal or something that comforts you when angry.",
                "Try drawing your feelings or playing with a pet to release your anger."
        });
        addAdvice("angry", "teen", "male", new String[]{
                "Take a moment to breathe deeply and center yourself.",
                "Find a healthy way to release your anger, like exercising or listening to music.",
                "Talk it out with someone you trust to help ease your frustration.",
                "Sometimes it helps to write down what made you angry and why.",
                "Remember, you don’t have to act on your anger right away, take your time."
        });
        addAdvice("angry", "teen", "female", new String[]{
                "It’s okay to be angry, but it’s also important to express it in a healthy way.",
                "Take a few minutes to calm down before talking to anyone.",
                "Engage in something that helps you relax, like yoga or journaling.",
                "Sometimes talking about it with a friend can help you feel better.",
                "Find a way to release the anger physically, like running or dancing."
        });
        addAdvice("angry", "young adult", "male", new String[]{
                "When you feel angry, take a few minutes to breathe deeply and calm down.",
                "Consider taking a break from the situation to clear your mind.",
                "Exercise can be a great way to channel anger in a healthy way.",
                "Talk to someone you trust, don’t bottle up your feelings.",
                "Remember, acting on anger without thinking can have negative consequences."
        });
        addAdvice("angry", "young adult", "female", new String[]{
                "Try to take a step back and reflect on why you’re angry.",
                "Breathing exercises can help calm you down when you're feeling angry.",
                "Physical activity, like a quick jog, can help release some of the anger.",
                "Don’t keep your feelings to yourself, talk to someone about it.",
                "Sometimes simply acknowledging your anger can help you move past it."
        });
        addAdvice("angry", "middle-aged adult", "male", new String[]{
                "When you’re angry, try to take a moment to pause and reflect.",
                "Physical exercise can help reduce anger and frustration.",
                "Remember, sometimes taking a break is the best thing to do.",
                "Try writing down your thoughts to gain clarity on the situation.",
                "Talk to someone close to you to work through your feelings."
        });
        addAdvice("angry", "middle-aged adult", "female", new String[]{
                "It’s okay to feel angry, but try to express it in a healthy way.",
                "Taking a break and calming down can help you approach the situation more calmly.",
                "Engage in an activity that relaxes you, like reading or a hobby.",
                "Physical exercise can help relieve some of the tension you’re feeling.",
                "Remember, you can control how you respond to anger, take a deep breath."
        });
        addAdvice("angry", "senior", "male", new String[]{
                "When you’re angry, taking a moment to breathe deeply can help calm your nerves.",
                "Consider doing a calming activity, like listening to music or walking.",
                "Talking to someone about your frustrations can help you feel heard.",
                "Try focusing on something that makes you feel relaxed and calm.",
                "Sometimes just taking a break is the best way to deal with anger."
        });
        addAdvice("angry", "senior", "female", new String[]{
                "When you feel angry, it’s helpful to take a break and focus on your breathing.",
                "Engage in a relaxing activity like knitting or reading.",
                "Talking to a friend or family member about your feelings can help.",
                "Taking a short walk can help clear your mind and reduce anger.",
                "It’s okay to feel angry, but taking time to calm down is important."
        });
        addAdvice("lonely", "child", "male", new String[]{
                "You are never truly alone. There are always people who care about you.",
                "Sometimes it helps to talk to a family member about how you're feeling.",
                "Try playing with your favorite toy, it may help you feel better.",
                "You can make new friends by joining a fun activity or group.",
                "Remember, everyone feels lonely sometimes, but things will get better."
        });
        addAdvice("lonely", "child", "female", new String[]{
                "It’s okay to feel lonely sometimes, but you can always talk to someone.",
                "Play with your favorite toy or activity to take your mind off loneliness.",
                "You can try making a new friend or talking to someone close to you.",
                "Remember that you’re never really alone, even if it feels that way.",
                "Sometimes cuddling up with a stuffed animal can help you feel safe and happy."
        });
        addAdvice("lonely", "teen", "male", new String[]{
                "When you feel lonely, talking to a friend can help you feel more connected.",
                "Consider joining a group or club that interests you, it can help you make new friends.",
                "Focus on a hobby you enjoy to take your mind off the loneliness.",
                "Remember, everyone experiences loneliness, and it will pass.",
                "Sometimes helping others can make you feel less lonely."
        });
        addAdvice("lonely", "teen", "female", new String[]{
                "Talking to someone you trust can help you feel less isolated.",
                "Try doing something you enjoy, like reading or drawing.",
                "Consider joining an online community or activity to connect with others.",
                "Remember, loneliness is a feeling, not a permanent state.",
                "Reaching out to a friend can make a huge difference in how you feel."
        });
        addAdvice("lonely", "young adult", "male", new String[]{
                "Reach out to friends or family, even a quick message can help you feel more connected.",
                "Consider volunteering or joining a group with shared interests to meet new people.",
                "Focus on things that make you happy and help you feel less isolated.",
                "Remember, loneliness is a normal part of life, and it can pass with time.",
                "Consider spending some time meditating or practicing mindfulness to ease loneliness."
        });
        addAdvice("lonely", "young adult", "female", new String[]{
                "Consider reaching out to a loved one to talk or hang out.",
                "Focus on things you love, like hobbies, to help you feel connected.",
                "Sometimes getting involved in new activities can help reduce feelings of loneliness.",
                "Remember, it’s okay to feel lonely, but it doesn’t define you.",
                "Reaching out to a friend or family member can make a big difference in how you feel."
        });
        addAdvice("lonely", "middle-aged adult", "male", new String[]{
                "Reaching out to friends or family for a chat can help ease loneliness.",
                "Sometimes focusing on a project or hobby can help you feel more connected.",
                "Consider spending some time outdoors, connecting with nature can be soothing.",
                "Remember that it’s okay to feel lonely, but don’t let it define you.",
                "Making small steps to connect with others can help ease feelings of isolation."
        });
        addAdvice("lonely", "middle-aged adult", "female", new String[]{
                "Reaching out to a friend or family member can help you feel less lonely.",
                "Try something new like joining a class or community group to meet people.",
                "Sometimes just talking about how you feel can make a big difference.",
                "Remember, loneliness is a feeling, not a permanent condition.",
                "Consider taking up a hobby that connects you with others, like gardening or reading."
        });
        addAdvice("lonely", "senior", "male", new String[]{
                "Consider joining a social group or community activity to meet new people.",
                "Reaching out to family and friends for a chat can help alleviate loneliness.",
                "Sometimes taking a walk outside or focusing on a hobby can ease the feeling of loneliness.",
                "Remember, many people feel lonely from time to time, but you’re never alone in this.",
                "It’s okay to feel lonely, but don’t hesitate to connect with others when you need support."
        });
        addAdvice("lonely", "senior", "female", new String[]{
                "Consider calling a friend or family member to share your feelings.",
                "Join a group activity or club to meet new people with similar interests.",
                "Sometimes a short walk in nature can help lift your mood.",
                "Focus on hobbies that bring you joy, like knitting or reading.",
                "Remember, you’re not alone, and connecting with others can help."
        });
        addAdvice("hungry", "child", "male", new String[]{
                "It’s important to eat a healthy snack to give you energy.",
                "Try a fun snack, like fruit or yogurt, to fill you up.",
                "A warm meal will help you feel better and have more energy.",
                "When you’re hungry, eating something nutritious is the best solution.",
                "Don’t forget to drink water, too, it can help you feel better."
        });
        addAdvice("hungry", "child", "female", new String[]{
                "Having a healthy snack will help you feel better and give you energy.",
                "Try eating something fun like a sandwich or fruit.",
                "Remember to eat something filling so you feel better.",
                "Drinking some water is also a great way to help with hunger.",
                "A healthy meal will give you the energy to play and enjoy your day."
        });
        addAdvice("hungry", "teen", "male", new String[]{
                "It’s important to eat something healthy to feel better.",
                "Grab a quick snack like a granola bar or fruit to satisfy your hunger.",
                "Try a balanced meal with protein, vegetables, and grains to give you energy.",
                "Drinking water helps with your hunger too, so don’t forget to hydrate.",
                "Remember to have meals regularly, it keeps your body strong."
        });
        addAdvice("hungry", "teen", "female", new String[]{
                "Eating a balanced meal will help you feel more energized and focused.",
                "Grab a healthy snack like a piece of fruit or a protein bar.",
                "Don’t forget to hydrate – water helps with hunger too!",
                "Try eating a nutritious meal to keep your energy up throughout the day.",
                "Remember, a good breakfast can keep you energized all day long."
        });
        addAdvice("hungry", "young adult", "male", new String[]{
                "When you’re hungry, grab a snack to satisfy your hunger until your next meal.",
                "Consider preparing a balanced meal to fuel your body and mind.",
                "Keep healthy snacks on hand to avoid getting too hungry throughout the day.",
                "Remember, eating regularly keeps your energy levels up.",
                "Don’t forget to stay hydrated, as water can also help curb hunger."
        });
        addAdvice("hungry", "young adult", "female", new String[]{
                "Grab a healthy snack like fruits or nuts to hold you over.",
                "Eating smaller, regular meals will help you avoid feeling too hungry.",
                "Consider prepping meals for the week to stay on track.",
                "Drink water to stay hydrated, it can also help curb your appetite.",
                "Eating balanced meals throughout the day will keep your energy levels up."
        });
        addAdvice("hungry", "middle-aged adult", "male", new String[]{
                "Eating balanced meals is essential to keep your energy levels steady.",
                "Grab a healthy snack, like nuts or fruit, if you're feeling hungry.",
                "It’s important to eat at regular intervals throughout the day.",
                "Hydration is key – drink water to help with hunger.",
                "Consider meal prepping to make healthy eating easier."
        });
        addAdvice("hungry", "middle-aged adult", "female", new String[]{
                "Ensure you’re eating balanced meals to keep your energy up.",
                "Grab a snack like yogurt or fruit to curb your hunger.",
                "Drinking water regularly will help keep you hydrated and manage hunger.",
                "Consider eating smaller meals more often to avoid hunger.",
                "Meal prepping can save time and keep your diet on track."
        });
        addAdvice("hungry", "senior", "male", new String[]{
                "Eating smaller nutritious meals can help manage hunger and health.",
                "Try a light snack like nuts, yogurt, or fruit to satisfy hunger.",
                "Stay hydrated; dehydration can sometimes feel like hunger.",
                "Make sure your meals include protein and fiber for lasting fullness.",
                "A warm meal can provide both comfort and energy when hungry."
        });
        addAdvice("hungry", "senior", "female", new String[]{
                "Having regular, healthy meals helps keep your body nourished.",
                "Try a snack with protein and fiber, like yogurt or whole grain crackers.",
                "Keep water nearby – it’s easy to confuse thirst with hunger.",
                "A nice warm soup or sandwich can be both filling and comforting.",
                "Eating small portions regularly can help prevent hunger between meals."
        });
    }

    private void addAdvice(String mood, String ageGroup, String gender, String[] messages) {
        advice.put(mood + "_" + ageGroup + "_" + gender, messages);
    }

    public String getAdvice(String mood, String ageGroup, String gender) {
        String key = mood + "_" + ageGroup + "_" + gender;
        String[] messages = advice.get(key);

        if (messages == null) {
            return "Not connected";
        }

        int index = random.nextInt(messages.length);
        return messages[index];
    }

    public String mapAgeToGroup(int age) {
        if (age >= 5 && age <= 12) {
            return "child";
        } else if (age >= 13 && age <= 17) {
            return "teen";
        } else if (age >= 18 && age <= 29) {
            return "young adult";
        } else if (age >= 30 && age <= 59) {
            return "middle-aged adult";
        } else if (age >= 60) {
            return "senior";
        } else {
            return "unknown";
        }
    }
}

// This level shows how to define your own functions.
// The code inside a function is not executed immediately. It's saved for later.
// This function has your hero collect the nearest coin.
function pickUpNearestCoin() {
    var items = hero.findItems();
    var distanceMin = 9999;
    var item;
    for (var i=0;i<items.length;i++){
        if (items[i].value >= 3) {
                if (hero.distanceTo(items[i]) < distanceMin) {
                    distanceMin = hero.distanceTo(items[i]);
                    item = items[i];
                    }
            }
    }
    if (item)
    {
        hero.move(item.pos);
    }else{
        item = hero.findNearestItem();
        hero.move(item.pos);
    }
    // var nearestCoin = hero.findNearest(items);
    // if(nearestCoin) {
    //     hero.move(nearestCoin.pos);
    // }
}

// This function has your hero summon a soldier.
function summonSoldier() {
    // If hero.gold is greater than the cost of the "soldier":
    if (hero.gold > hero.costOf("soldier")) {
        hero.summon("soldier");
    }
        // Then summon a "soldier":
}

// This function commands your soldiers to attack their nearest enemy.
function commandSoldiers() {
    var friends = hero.findFriends();
    for(var i=0; i < friends.length; i++) {
        var enemy = friends[i].findNearestEnemy();
        if(enemy) {
            hero.command(friends[i],"attack", enemy);
        }
    }
}

while(true) {
    // In your loop, you can "call" the functions defined above.
    // The following line causes the code inside the "pickUpNearestCoin" function to be executed.
    pickUpNearestCoin();
    // Call summonSoldier here
    summonSoldier();
    // Call commandSoldiers here
    commandSoldiers();
    var enemy = hero.findNearestEnemy();
    var enemies = hero.findEnemies();
    var number=0;
    for (var i=0;i<enemies.length;i++){
        if (hero.distanceTo(enemies[i]) < 10) {
                number++;
            } 
        }
    
        if (number>10) {
           if (hero.isReady("cleave")) {
                hero.cleave(enemy);
            }
        }  else {
                pickUpNearestCoin();
                }
        
    
}
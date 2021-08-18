// 明智地指挥农民，有效地收集黄金！
// 农民们应该收集硬币并建造诱饵。

// 函数应该返回每个目标的最佳项
// 使用ID的数组来确保，没有两个农民以同一项目作为目标。
function findBestItem(friend, excludedItems) {
    var items = friend.findItems();
    var bestItem = null;
    var bestItemValue = 0;
    for(var i = 0; i < items.length; i++) {
        var item = items[i];
        // indexOf可以在数组中搜索特定元素：
        var idx = excludedItems.indexOf(item);
        // 如果该数组不包含它，它将返回-1
        // 在这种情况下，跳过这个项目，因为它已经是另一个农民的目标。
        if(idx != -1) { continue; }
        // 完成函数！
        // 记住，bestItemValue应该是最高的item.value / distanceTo
       
        if (bestItemValue < item.value/friend.distanceTo(item)) {
             bestItemValue = item.value/friend.distanceTo(item);
             bestItem = item;
        }
    }
   // hero.say(bestItem.pos);
    return bestItem;
}

// 这个函数检查你是否有用于诱饵的足够黄金。
function enoughGoldForDecoy() {
    return hero.gold >= 25;
}

while(true) {
    var peasants = hero.findByType("peasant");
    // 在每个循环中创建一个新数组。
    var claimedItems = [];
    for(var i = 0; i < peasants.length; i++) {
        var peasant = peasants[i];
        var enemy = peasant.findNearestEnemy();
        if(enemy) {
            // 如果农民是敌人的目标
            // “且”英雄有足够的黄金用于诱饵
            if (enemy.target == peasant && hero.gold > 25) {
                hero.command(peasant, "buildXY", "decoy",peasant.pos.x+5,peasant.pos.y);
                continue;
            }
                // 命令一个农民来建造"decoy"：
                
                // 添加一个continue，这样农民在建造时就不会收集硬币。
                //continue;
        }
        var item = findBestItem(peasant, claimedItems);
        if(item) {
            // 项目已经名花有主后，将它放入claimedItems数组中。
            claimedItems.push(item);
            // 命令农民收集硬币：
            hero.command(peasant, "move", item.pos);
            //peasant.move(bestItem.pos);
        }
    }
}

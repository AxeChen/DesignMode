package com.axe.strategy;

public class StrategyMain {
	public static void main(String[] args) {
		// 未使用策略模式
		Bounty bounty = new Bounty();
		int getMoney = bounty.killGetMoney(Bounty.TYPE_BATMAM, 10) + bounty.killGetMoney(Bounty.TYPE_HERO, 1)
				+ bounty.killGetMoney(Bounty.TYPE_MONSTER, 6);
		System.out.println(getMoney);

		// 使用策略模式
		int sum = 0;
		BountyCalculater calculater = new BountyCalculater();

		calculater.setGetMoney(new BatmanCalculater());
		sum += calculater.getBountyMoney(10);

		calculater.setGetMoney(new HeroMoneyCalculater());
		sum += calculater.getBountyMoney(5);

		calculater.setGetMoney(new DragonCalculater());
		sum += calculater.getBountyMoney(1);

		calculater.setGetMoney(new MonsterCalculater());
		sum += calculater.getBountyMoney(34);
		System.out.println(sum);

	}
}

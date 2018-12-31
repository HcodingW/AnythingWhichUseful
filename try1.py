# -*- coding: utf-8 -*-
"""
Created on Wed Oct  3 11:50:09 2018
@author: Han Wu
"""


import numpy as np

# 三轮比赛，每轮中按照A对B,B对C,C对A的顺序排列，下面是三轮下来的比分
x = np.array([[[0, 1], [2, 3], [2, 4]], [[2, 1], [4, 4], [1, 2]], [[1, 1], [2, 1], [2, 0]]])

ab = x[:, 0, 0] > x[:, 0, 1]; abd = x[:, 0, 0]==x[:, 0, 1]
ba = x[:, 0, 0] < x[:, 0, 1]

bc = x[:, 1, 0] > x[:, 1, 1]; bcd = x[:, 1, 0]==x[:, 1, 1]
cb = x[:, 1, 0] < x[:, 1, 1]

ca = x[:, 2, 0] > x[:, 2, 1]; cad = x[:, 2, 0]==x[:, 2, 1]
ac = x[:, 2, 0] < x[:, 2, 1]

ab = ab + 0; abd = abd + 0;
ba = ba + 0

bc = bc + 0; bcd = bcd + 0;
cb = cb + 0

ca = ca + 0; cad = cad + 0;
ac = ac + 0;

# 胜队得3分，打平得1分，负队不得分
score = np.zeros(3, dtype=int)
score[0] = 3*(np.sum(ab)+np.sum(ac)) + (np.sum(abd)+np.sum(cad))  # A队积分
score[1] = 3*(np.sum(bc)+np.sum(ba)) + (np.sum(abd)+np.sum(bcd))  # B队积分
score[2] = 3*(np.sum(ca)+np.sum(cb)) + (np.sum(bcd)+np.sum(cad))  # C队积分
print(score)
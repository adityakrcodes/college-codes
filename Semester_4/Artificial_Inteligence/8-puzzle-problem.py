from collections import deque
from types import MethodDescriptorType

goal_state = (1, 2, 3, 4, 5, 6, 7, 8, 0)
moves = {
        0: (1, 3),
        1: (0, 2, 4),
        2: (1, 5),
        3: (0, 4, 6),
        4: (1, 3, 5, 7),
        5: (2, 4, 8),
        6: (3, 7),
        7: (4, 6, 8),
        8: (5, 7)
}

def find_empty(state):
    return state.index(0)

def make_move(state, move):
    state = list(state)
    empty_index = find_empty(state)
    state[empty_index], state[move] = state[move], state[empty_index]
    return tuple(state)

def bfs(start_state):
    queue = deque([(start_state, [])])
    visited = set()
    while queue:
        current_state, path = queue.popleft()
        if current_state == goal_state:
            return path
        if current_state in visited:
            continue
        visited.add(current_state)
        empty_index = find_empty(current_state)
        for move_index in moves[empty_index]:
            new_state = make_move(current_state, move_index)
            new_path = path + [move_index]
            queue.append((new_state, new_path))

start_state = (1, 2, 3, 4, 5, 6, 7, 0, 8)
solution = bfs(start_state)
print("Initial State:")
for i in range(0, 9, 3):
    print(start_state[i:i + 3])
print("Sequence of moves to reach the goal state:", solution)

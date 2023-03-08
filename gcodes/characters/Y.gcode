; base skeleton code for writing

G28 ; Home all axes
G1 Z2 ; Move Z Axis up little to prevent scratching of Heat Bed
; Stuff Go Here

G0 X110 Y110; go to char orgin
G0 Z0 ; lower to 0
G91 ; relitive positioning

; Y
G1 Z1 
G0 Y13 E0
G1 Z-1
G0 X4 Y-4 E0.2
G0 X4 Y4 E0.2
G1 Z1 
G0 X-4 Y-4 E0
G1 Z-1
G0 Y-9 E0.2


G90 ; absolute positioning
G1 Z1 ; raise a bit

G1 Z10 ;Raise Z
G90 ;Absolute positioning
G1 X0 Y220 ;Present print
M84 X Y E ;Disable all steppers but Z
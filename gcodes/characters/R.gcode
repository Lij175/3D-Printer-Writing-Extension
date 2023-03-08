; base skeleton code for writing

G28 ; Home all axes
G1 Z2 ; Move Z Axis up little to prevent scratching of Heat Bed
; Stuff Go Here

G0 X110 Y110; go to char orgin
G0 Z0 ; lower to 0
G91 ; relitive positioning

; P
G0 Y13 E0.2
G0 X4 E0.2
G0 X0.5013 Y-0.0315 E0.2
G0 X0.4935 Y-0.0942 E0.2
G0 X0.4777 Y-0.1552 E0.2
G0 X0.4545 Y-0.2139 E0.2
G0 X0.4241 Y-0.2691 E0.2
G0 X0.3871 Y-0.3202 E0.2
G0 X0.3439 Y-0.3662 E0.2
G0 X0.2952 Y-0.4064 E0.2
G0 X0.242 Y-0.4402 E0.2
G0 X0.1849 Y-0.467 E0.2
G0 X0.1249 Y-0.4866 E0.2
G0 X0.063 Y-0.4983 E0.2
G0 X0.0 Y-0.5024 E0.2
G0 X-0.063 Y-0.4983 E0.2
G0 X-0.1249 Y-0.4866 E0.2
G0 X-0.1849 Y-0.467 E0.2
G0 X-0.242 Y-0.4402 E0.2
G0 X-0.2952 Y-0.4064 E0.2
G0 X-0.3439 Y-0.3662 E0.2
G0 X-0.3871 Y-0.3202 E0.2
G0 X-0.4241 Y-0.2691 E0.2
G0 X-0.4545 Y-0.2139 E0.2
G0 X-0.4777 Y-0.1552 E0.2
G0 X-0.4935 Y-0.0942 E0.2
G0 X-0.5013 Y-0.0315 E0.2
G0 X-4 E0.2
G1 Z1
G0 X4 E0
G1 Z-1
G0 X4 Y-5 E0.2

G90 ; absolute positioning
G1 Z1 ; raise a bit

G1 Z10 ;Raise Z
G90 ;Absolute positioning
G1 X0 Y220 ;Present print
M84 X Y E ;Disable all steppers but Z